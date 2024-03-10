package Aula8;

public class LigeiroEletrico extends Ligeiro implements VeiculoEletrico {
    private int autonomia;

    public LigeiroEletrico(String matricula, String marca, String modelo, int potencia, int nquadro, int bagageira,
            int autonomia) {
        super(matricula, marca, modelo, potencia, nquadro, bagageira);
        this.setAutonomia(autonomia);
    }
    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public int autonomia() {
        return autonomia;
    }

    @Override
    public void carregar(int percentagem) {
        this.autonomia += percentagem;

    }

}
