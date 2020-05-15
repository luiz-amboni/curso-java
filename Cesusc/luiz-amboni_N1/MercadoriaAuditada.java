package fretadora.cesusc;

import java.time.LocalDateTime;

public abstract class MercadoriaAuditada extends Mercadoria {

    private LocalDateTime dataInspecao;
    private String orgaoInspecao;

    public MercadoriaAuditada(String descricao, String tipo, Float peso, String numeroNotaFiscal) {
        super(descricao, tipo, peso, numeroNotaFiscal);
    }

    public MercadoriaAuditada() {
        super();
    }

    @Override
    public String toString() {
        return super.toString()+
                ", dataInspecao=" + dataInspecao +
                ", orgaoInspecao='" + orgaoInspecao + '\'' ;

    }

    public LocalDateTime getDataInspecao() {
        return dataInspecao;
    }

    protected void setDataInspecao(LocalDateTime dataInspecao) {
        this.dataInspecao = dataInspecao;
    }

    public String getOrgaoInspecao() {
        return orgaoInspecao;
    }

    protected void setOrgaoInspecao(String orgaoInspecao) {
        this.orgaoInspecao = orgaoInspecao;
    }
}
