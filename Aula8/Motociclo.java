package Aula8;

public class Motociclo extends Viatura {
    private Type tipo;

    public Motociclo(String matricula, String marca, String modelo, int potencia, Type tipo) {
        super(matricula, marca, modelo, potencia);
        this.tipo = tipo;
    }

    public enum Type {
        desportivo, estrada;
    }

    public Type getTipo() {
        return tipo;
    }

    public void setTipo(Type tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
        Motociclo other = (Motociclo) obj;
        if (tipo != other.tipo)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Motociclo" + super.toString() + "tipo=" + tipo + "}";
    }

    
}
