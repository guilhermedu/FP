package Aula8;

import Aula8.Motociclo.Type;

public class Exercicio8_1 {
    public static void main(String[] args) {
        String wrongmail = "kkadslkas.,.@amgoe.com",correctmail = "joserodrigues@gmail.org",matriculavalida = "22-94-CD", matriculainvalida = "Xd-w9-x8";
        System.out.println(Empresa.emailValidator(wrongmail));
        System.out.println(Empresa.emailValidator(correctmail));
        System.out.println(Empresa.matriculaValidator(matriculainvalida));
        System.out.println(Empresa.matriculaValidator(matriculavalida));
        Empresa Automobiles = new Empresa("Automobiles", "Automobiles@gmail.com", "2499-999");
        Ligeiro Seatibiza = new Ligeiro("00-22-PI", "Seat", "Ibiza", 80);
        PMercadorias Ferrari = new PMercadorias("22-07-XD", "Ferrari", "Camion", 69, 499453, 100000, 3);
        Motociclo motoca = new Motociclo("00-47-DD", "BMX", "GottaGoFast", 100, Type.desportivo);
        Taxi taxivrum = new Taxi("95-67-BD", "Peugeot", "203", 90, 495);
        PMercadorias Lamborghine = new PMercadorias("27-03-KG", "Lamborghini", "Desventador", 130, 67849, 130000, 7);
        Automobiles.addVeiculo(Seatibiza);
        Automobiles.addVeiculo(Ferrari);
        Automobiles.addVeiculo(motoca);
        Automobiles.addVeiculo(taxivrum);
        Seatibiza.trajetos.add(500);
        Seatibiza.trajetos.add(20);
        Seatibiza.trajetos.add(60);
        Ferrari.trajetos.add(30);
        Ferrari.trajetos.add(100);
        Ferrari.trajetos.add(1000);
        motoca.trajetos.add(32);
        motoca.trajetos.add(270);
        motoca.trajetos.add(192);
        taxivrum.trajetos.add(985);
        taxivrum.trajetos.add(23);
        taxivrum.trajetos.add(10);
        System.out.println(Seatibiza.toString());
        System.out.println(Ferrari.toString());
        System.out.println(motoca.toString());
        System.out.println(taxivrum.toString());
        System.out.println("A marca do carro com matrícula " + taxivrum.getMatricula() + " é: " + taxivrum.getMarca());
        System.out.println("Ferrari camion = Lamborghini Desventador? " + Ferrari.equals(Lamborghine));
        System.out.println("Distancia total da motoca: " + motoca.distanciaTotal());
        motoca.trajeto(10);
        System.out.println("Distancia total da motoca: " + motoca.distanciaTotal());
        System.out.println("A viatura com mais quilómetros é : " + Automobiles.maiorKMS());
        LigeiroEletrico Tesla = new LigeiroEletrico("78-23-OI", "Tesla", "Model Y", 380, 3485, 27, 75);
        PPElétrico CamionTunado = new PPElétrico(227304, 1000008, 6, "49-93-JF", "Tesla", "CyberTruck", 49, 23);
        Automobiles.addVeiculo(Tesla);
        Automobiles.addVeiculo(CamionTunado);
        System.out.println("Autonomia do " + Tesla.getMarca()+ " " + Tesla.getModelo() + " :" +Tesla.autonomia());
        System.out.println("Autonomia do " + CamionTunado.getMarca()+ " " + CamionTunado.getModelo() + " :" +CamionTunado.autonomia());
        CamionTunado.carregar(57);
        System.out.println("Autonomia do " + CamionTunado.getMarca()+ " " + CamionTunado.getModelo() + " :" +CamionTunado.autonomia());
        Tesla.trajetos.add(2345);
        Tesla.trajetos.add(1012);
        CamionTunado.trajetos.add(859);
        System.out.println("A viatura com mais quilómetros é : " + Automobiles.maiorKMS());

    }
}
