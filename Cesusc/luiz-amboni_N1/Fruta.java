package fretadora.cesusc;

public class Fruta extends Mercadoria {

    private String nomeFruta;
    private Float precoFrutaKg;

    public Fruta(String descricao, String tipo, Float peso, String numeroNotaFiscal, String nomeFruta, Float precoFrutaKg) {
        super(descricao, tipo, peso, numeroNotaFiscal);
        this.nomeFruta = nomeFruta;
        this.precoFrutaKg = precoFrutaKg;
    }

    @Override
    public String toString() {
        return "Fruta{" +
                "nomeFruta='" + nomeFruta + '\'' +
                ", precoFrutaKg=" + precoFrutaKg +
                super.toString() +
                '}';
    }

    public Fruta() {
        super();
    }

    public String getNomeFruta() {
        return nomeFruta;
    }

    public void setNomeFruta(String nomeFruta) {
        this.nomeFruta = nomeFruta;
    }

    public Float getPrecoFrutaKg() {
        return precoFrutaKg;
    }

    public void setPrecoFrutaKg(Float precoFrutaKg) {
        this.precoFrutaKg = precoFrutaKg;
    }


}
