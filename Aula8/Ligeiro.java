package Aula8;

public class Ligeiro extends Viatura {
    private int nquadro, bagageira;
    public Ligeiro(String matricula, String marca, String modelo, int potencia, int nquadro, int bagageira) {
        super(matricula, marca, modelo, potencia);
        this.bagageira=bagageira;
        this.nquadro=nquadro;
        
    }
    public Ligeiro(String matricula, String marca, String modelo, int potencia){
        super(matricula,marca,modelo,potencia);
    }
    

    public int getNquadro() {
        return nquadro;
    }

    public int getBagageira() {
        return bagageira;
    }

    public void setBagageira(int bagageira) {
        this.bagageira = bagageira;
    }

    public void setNquadro(int nquadro) {
        this.nquadro = nquadro;
    }
    @Override
    public String toString() {
        return "Ligeiro " + super.toString() + " bagageira=" + bagageira + ", nquadro=" + nquadro + " }" ;
    }

}
