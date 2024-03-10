package Aula8;

import java.util.ArrayList;

public abstract class Viatura implements KmPercorridosInterface {
    private String matricula, marca, modelo;
    private int potencia;
    ArrayList<Integer> trajetos = new ArrayList<Integer>();
    int distanciatotal = 0;

    public Viatura(String matricula, String marca, String modelo, int potencia) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void trajeto(int quilometros) {
        this.trajetos.add(quilometros);
    }

    public int ultimoTrajeto() {
        return this.trajetos.get(trajetos.size() - 1);
    }

    public int distanciaTotal() {
        distanciatotal=0;
        for (int i = 0; i < this.trajetos.size(); i++) {
            distanciatotal += this.trajetos.get(i);
        }
        return distanciatotal;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + distanciatotal;
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + potencia;
        result = prime * result + ((trajetos == null) ? 0 : trajetos.hashCode());
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
        Viatura other = (Viatura) obj;
        if (distanciatotal != other.distanciatotal)
            return false;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        if (potencia != other.potencia)
            return false;
        if (trajetos == null) {
            if (other.trajetos != null)
                return false;
        } else if (!trajetos.equals(other.trajetos))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "{distanciatotal=" + distanciatotal + ", marca=" + marca + ", matricula=" + matricula
                + ", modelo=" + modelo + ", potencia=" + potencia + ", trajetos=" + trajetos ;
    }
}

   