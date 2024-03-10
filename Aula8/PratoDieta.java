package Aula8;

import java.util.ArrayList;

public class PratoDieta extends Prato {
    private Double limcalorias,caloriastotais=0.0;
    
    ArrayList<Object> alimentos = new ArrayList<Object>();

    public PratoDieta(String nome, Double limcalorias) {
        super(nome);
        this.limcalorias = limcalorias;
    }

    public Double getLimcalorias() {
        return limcalorias;
    }

    public void setLimcalorias(Double limcalorias) {
        this.limcalorias = limcalorias;
    }

    public boolean addIngrediente(Alimento aux) {
        if (aux.getCalorias() < this.limcalorias) {
            alimentos.add(aux);
            caloriastotais += aux.getCalorias();
            limcalorias -= aux.getCalorias();
            return true;
        } else
            return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((alimentos == null) ? 0 : alimentos.hashCode());
        result = prime * result + ((limcalorias == null) ? 0 : limcalorias.hashCode());
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
        PratoDieta other = (PratoDieta) obj;
        if (alimentos == null) {
            if (other.alimentos != null)
                return false;
        } else if (!alimentos.equals(other.alimentos))
            return false;
        if (limcalorias == null) {
            if (other.limcalorias != null)
                return false;
        } else if (!limcalorias.equals(other.limcalorias))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PratoDieta " + super.getNome() + " [alimentos=" + alimentos + ", Calorias:" + caloriastotais + "]";
    }
}
