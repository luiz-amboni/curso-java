package fretadora.cesusc;

import java.time.LocalDateTime;

public class FreteDemanda extends Frete {

    public LocalDateTime dataColeta;

    public FreteDemanda(String mercadoria, String cidadeOrigem, String cidadeDestino, Float distanciaKm, LocalDateTime dataColeta) {
        super(mercadoria, cidadeOrigem, cidadeDestino, distanciaKm);
        this.dataColeta = dataColeta;
    }

    public FreteDemanda() {
        super();
    }

    @Override
    public String toString() {
        return "FreteDemanda{" +
                "dataColeta=" + dataColeta +
                super.toString()+
                '}';
    }

    public LocalDateTime getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta(LocalDateTime dataColeta) {
        this.dataColeta = dataColeta;
    }

    @Override
    public Double calculaValorFrete() { return (300 + 0.6 * getDistanciaKm());
    }
}
