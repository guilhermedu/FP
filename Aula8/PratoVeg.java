package Aula8;

public class PratoVeg extends Prato {

    public PratoVeg(String nome) {
        super(nome);
    }

    public boolean addIngrediente(Alimento aux) {
        if (aux instanceof Carne || aux instanceof Peixe)
            return false;
        else {
            alimentos.add(aux);
            return true;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((alimentos == null) ? 0 : alimentos.hashCode());
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
        PratoVeg other = (PratoVeg) obj;
        if (alimentos == null) {
            if (other.alimentos != null)
                return false;
        } else if (!alimentos.equals(other.alimentos))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PratoVeg " + super.getNome() + " [alimentos=" + alimentos + "]";
    }
}
