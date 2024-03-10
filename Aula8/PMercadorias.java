package Aula8;

public class PMercadorias extends Viatura {
    private int nquadro, peso, npassageiros;

    public PMercadorias( String matricula, String marca , String modelo, int potencia, int nquadro, int peso, int npassageiros) {
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
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + npassageiros;
        result = prime * result + nquadro;
        result = prime * result + peso;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        PMercadorias other = (PMercadorias) obj;
        if (npassageiros != other.npassageiros)
            return false;
        if (nquadro != other.nquadro)
            return false;
        if (peso != other.peso)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PMercadorias" + super.toString() + "npassageiros=" + npassageiros + ", nquadro=" + nquadro + ", peso=" + peso + "}";
    }

}
