package fretadora.cesusc;

import java.time.LocalDateTime;

public class ProdutosPerigosos extends MercadoriaAuditada implements InspecaoMercadoria{

    private String nomeMercadoria;

    public ProdutosPerigosos(String descricao, String tipo, Float peso, String numeroNotaFiscal, String nomeMercadoria) {
        super(descricao, tipo, peso, numeroNotaFiscal);
        this.nomeMercadoria = nomeMercadoria;
    }

    public ProdutosPerigosos() {
        super();
    }

    @Override
    public String toString() {
        return "ProdutosPerigosos{" +
                "nomeMercadoria='" + nomeMercadoria + '\'' +
                super.toString()+
                '}';
    }

    @Override
    public void inpecionar(LocalDateTime dataInspecao, String orgaoInspecao) {
        this.setDataInspecao(dataInspecao);
        this.setOrgaoInspecao(orgaoInspecao);
    }

    public String getNomeMercadoria() {
        return nomeMercadoria;
    }

    public void setNomeMercadoria(String nomeMercadoria) {
        this.nomeMercadoria = nomeMercadoria;
    }
}
