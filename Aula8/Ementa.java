package Aula8;

import java.util.ArrayList;

public class Ementa {
    enum DiaSemana {
        SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
    }
    private String nome, local;
    ArrayList<Object> pratos = new ArrayList<Object>();

    public Ementa(String nome, String local) {
        this.nome = nome;
        this.setLocal(local);
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean addPrato(Prato prato, DiaSemana dia ){
            pratos.add(prato);
            return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((local == null) ? 0 : local.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((pratos == null) ? 0 : pratos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ementa other = (Ementa) obj;
        if (local == null) {
            if (other.local != null)
                return false;
        } else if (!local.equals(other.local))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (pratos == null) {
            if (other.pratos != null)
                return false;
        } else if (!pratos.equals(other.pratos))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Ementa local=" + local + ", nome=" +  nome + "\n" + pratos.get(0) + " - Segunda Feira\n" + pratos.get(1) + " - Terça-Feira\n" +pratos.get(2) + " - Quarta Feira\n" +pratos.get(3) + " - Quinta Feira\n" +pratos.get(4) + " - Sexta Feira\n" +pratos.get(5) + " - Sábado\n" +pratos.get(6) + " - Domingo\n" ;
    }
}
