package aula03;

public abstract class Pagamento {
    private String nomePagador;
    private String nomeRecebedor;
    private Double valorPagamento;
    private Double valorPagamentoDolar;

    public abstract boolean validaCodigoBarra(String codigo);

    public void converteParaDolar(Double cotacao) {
        valorPagamentoDolar = cotacao * valorPagamento;
    }

    public String getNomePagador() {
        return nomePagador;
    }

    public void setNomePagador(String nomePagador) {
        this.nomePagador = nomePagador;
    }

    public String getNomeRecebedor() {
        return nomeRecebedor;
    }

    public void setNomeRecebedor(String nomeRecebedor) {
        this.nomeRecebedor = nomeRecebedor;
    }

    public Double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(Double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public Double getValorPagamentoDolar() {
        return valorPagamentoDolar;
    }

    public static Double getConversao(Double valor, Double cotacao) {
        return valor * cotacao;
    }
}
