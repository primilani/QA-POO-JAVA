package Desafio.Guincho;

class CaminhaoGuinchoPlataforma implements Guincho {
    private static final double TAXA_POR_KM = 5.0;

    @Override
    public double calcularCustoDoDeslocamento(Trajeto trajeto) {
        return trajeto.getDistanciaEmKm() * TAXA_POR_KM;
    }
}