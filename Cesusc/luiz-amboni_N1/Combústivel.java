package fretadora.cesusc;

import java.time.LocalDateTime;

public class Combústivel extends MercadoriaAuditada implements InspecaoMercadoria {

    private String tipoCombustivel;
    private Float quantidadeCombustivel;

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(Float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public Combústivel(String descricao, String tipo, Float peso, String numeroNotaFiscal, String tipoCombustivel, Float quantidadeCombustivel) {
        super(descricao, tipo, peso, numeroNotaFiscal);
        this.tipoCombustivel = tipoCombustivel;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public Combústivel() {
        super();
    }

    @Override
    public String toString() {
        return "Combústivel{" +
                "tipoCombustivel='" + tipoCombustivel + '\'' +
                ", quantidadeCombustivel=" + quantidadeCombustivel +
                super.toString()+
                '}';
    }

    @Override
    public void inpecionar(LocalDateTime dataInspecao, String orgaoInspecao) {
        this.setDataInspecao(dataInspecao);
        this.setOrgaoInspecao(orgaoInspecao);
    }
}
