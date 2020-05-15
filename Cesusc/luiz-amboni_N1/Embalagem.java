package fretadora.cesusc;

public class Embalagem extends Mercadoria {

    private String materialEmbalagem;
    private Float quantidadeEmbalem;

    public Embalagem(String descricao, String tipo, Float peso, String numeroNotaFiscal, String materialEmbalagem, Float quantidadeEmbalem) {
        super(descricao, tipo, peso, numeroNotaFiscal);
        this.materialEmbalagem = materialEmbalagem;
        this.quantidadeEmbalem = quantidadeEmbalem;
    }

    public Embalagem() {
        super();
    }

    @Override
    public String toString() {
        return "Embalagem{" +
                "materialEmbalagem='" + materialEmbalagem + '\'' +
                ", quantidadeEmbalem=" + quantidadeEmbalem +
                super.toString()+
                '}';
    }

    public String getMaterialEmbalagem() {
        return materialEmbalagem;
    }

    public void setMaterialEmbalagem(String materialEmbalagem) {
        this.materialEmbalagem = materialEmbalagem;
    }

    public Float getQuantidadeEmbalem() {
        return quantidadeEmbalem;
    }

    public void setQuantidadeEmbalem(Float quantidadeEmbalem) {
        this.quantidadeEmbalem = quantidadeEmbalem;
    }
}
