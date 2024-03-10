package Aula8;

public class PPElétrico extends PPassageiros implements VeiculoEletrico {
    public PPElétrico(int nquadro, int peso, int npassageiros, String matricula, String marca, String modelo,
            int potencia, int autonomia) {
        super(nquadro, peso, npassageiros, matricula, marca, modelo, potencia);
        this.autonomia = autonomia;
    }

    private int autonomia;

    @Override
    public int autonomia() {
        return autonomia;
    }

    @Override
    public void carregar(int percentagem) {
        this.autonomia += percentagem;

    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
}
