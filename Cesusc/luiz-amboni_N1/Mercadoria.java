package fretadora.cesusc;

public abstract class Mercadoria {

    private String descricao;
    private String tipo;
    private Float peso;
    private String numeroNotaFiscal;

    public String getDescricao() {
        return descricao;
    }

    public Mercadoria(String descricao, String tipo, Float peso, String numeroNotaFiscal) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.peso = peso;
        this.numeroNotaFiscal = numeroNotaFiscal;
    }

    public Mercadoria() {
    }

    @Override
    public String toString() {
        return
                ", descricao='" + descricao + '\'' +
                ", tipo='" + tipo + '\'' +
                ", peso=" + peso +
                ", numeroNotaFiscal='" + numeroNotaFiscal + '\'' ;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }

    public void setNumeroNotaFiscal(String numeroNotaFiscal) {
        this.numeroNotaFiscal = numeroNotaFiscal;
    }


}
