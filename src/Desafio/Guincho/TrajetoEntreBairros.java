package Desafio.Guincho;

public class TrajetoEntreBairros implements Trajeto {

    private int distanciaEmKm;

    public TrajetoEntreBairros(int distanciaEmKm){
        this.distanciaEmKm = distanciaEmKm;
    }

    public Integer getDistanciaEmKm(){
        return distanciaEmKm;
    }

}
