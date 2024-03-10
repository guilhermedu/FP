package Aula8;

public class PPassageiros extends Viatura {
    private int nquadro, peso , npassageiros;

    public PPassageiros(int nquadro, int peso, int npassageiros,String matricula, String marca , String modelo, int potencia) {
        super(matricula, marca, modelo, potencia);
        this.nquadro = nquadro;
        this.peso = peso;
        this.npassageiros = npassageiros;
    }

    public int getNquadro() {
        return nquadro;
    }

    public int getNpassageiros() {
        return npassageiros;
    }

    public void setNpassageiros(int npassageiros) {
        this.npassageiros = npassageiros;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setNquadro(int nquadro) {
        this.nquadro = nquadro;
    }

    @Override
    public String toString() {
        return "PPassageiros" + super.toString() + "npassageiros=" + npassageiros + ", nquadro=" + nquadro + ", peso=" + peso + "}";
    }

}
