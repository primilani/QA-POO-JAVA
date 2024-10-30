package Desafio.Guincho;

public class CaminhaoCorrenteGancho implements Guincho  {
    private static final double TAXA_POR_KM = 2.0;

    @Override
    public double calcularCustoDoDeslocamento(Trajeto trajeto) {

       return trajeto.getDistanciaEmKm() * TAXA_POR_KM;
    }

}