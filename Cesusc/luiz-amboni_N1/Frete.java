package fretadora.cesusc;

public abstract class Frete {

    private String mercadoria;
    private String cidadeOrigem;
    private String cidadeDestino;
    private Float distanciaKm;


    public Frete(String mercadoria, String cidadeOrigem, String cidadeDestino, Float distanciaKm) {
        this.mercadoria = mercadoria;
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
        this.distanciaKm = distanciaKm;
    }

    public Frete() {
    }

    @Override
    public String toString() {
        return
                ", mercadoria='" + mercadoria + '\'' +
                ", cidadeOrigem='" + cidadeOrigem + '\'' +
                ", cidadeDestino='" + cidadeDestino + '\'' +
                ", distanciaKm=" + distanciaKm
                ;
    }

    public String getMercadoria() {
        return mercadoria;
    }

    public void setMercadoria(String mercadoria) {
        this.mercadoria = mercadoria;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public Float getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(Float distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public abstract Double calculaValorFrete();

}
