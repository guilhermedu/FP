package Aula8;

public class Taxi extends Ligeiro {
    private int nlicença;

    public Taxi(String matricula, String marca, String modelo, int potencia, int nlicença) {
        super(matricula, marca, modelo, potencia);
        this.nlicença = nlicença;
    }

    public int getNlicença() {
        return nlicença;
    }

    public void setNlicença(int nlicença) {
        this.nlicença = nlicença;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + nlicença;
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
        Taxi other = (Taxi) obj;
        if (nlicença != other.nlicença)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Taxi" + super.toString() + "nlicença=" + nlicença + "}";
    }

}
