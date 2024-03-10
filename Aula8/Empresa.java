package Aula8;

import java.util.ArrayList;
import java.util.regex.*;


public class Empresa {
    private String nome, email, codigopostal, carro;
    private int max=0;
    

    ArrayList<Object> veiculos = new ArrayList<Object>();

    public Empresa(String nome, String email, String codigopostal) {
        this.setNome(nome);
        this.setEmail(email);
        this.setCodigopostal(codigopostal);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public void addVeiculo(Object veiculo) {
        veiculos.add(veiculo);
    }

    public void removeVeiculo(Object veiculo) {
        veiculos.remove(veiculo);
    }

    public String maiorKMS() {
        for (Object cars : veiculos) {
            Viatura other = (Viatura) cars;
            int distancia = other.distanciaTotal();
             if (  distancia > max ){
             max = distancia;
             carro = other.getMarca() + " "  + other.getModelo();
            }
            else 
            continue;
        }
        return carro + ", com " + max + " quilómetros";
        }
    public static String emailValidator(String email){
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
        Pattern pattern = Pattern.compile(regex);  
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches())
            return "Email válido!";
            else  
            return "Email inválido!";  
    }
    public static String matriculaValidator(String matricula){
        String regex = "[0-9]{2}[\s-]{0,1}[0-9]{2}[\s-]{0,1}[A-IK-PR-VZ]{2}|[0-9]{2}[\s-]{0,1}[A-IK-PR-VZ]{2}[\s-]{0,1}[0-9]{2}|[A-IK-PR-WYZ]{2}[\s-]{0,1}[0-9]{2}[\s-]{0,1}[A-IK-PR-WYZ]{2}";  
        Pattern pattern = Pattern.compile(regex);  
            Matcher matcher = pattern.matcher(matricula);
            if (matcher.matches())
            return "Matricula válida!";
            else  
            return "Matricula inválida!";  
    }
}


