package fretadora.cesusc;

public class FreteRegular extends Frete {

     private Float frequencia;
     private String unidadeFrequencia;
     private Integer quantidadeOperacoes;

     public FreteRegular(String mercadoria, String cidadeOrigem, String cidadeDestino, Float distanciaKm, Float frequencia, String unidadeFrequencia, Integer quantidadeOperacoes) {
          super(mercadoria, cidadeOrigem, cidadeDestino, distanciaKm);
          this.frequencia = frequencia;
          this.unidadeFrequencia = unidadeFrequencia;
          this.quantidadeOperacoes = quantidadeOperacoes;
     }

     public FreteRegular() {
          super();
     }

     @Override
     public String toString() {
          return "FreteRegular{" +
                  "frequencia=" + frequencia +
                  ", unidadeFrequencia='" + unidadeFrequencia + '\'' +
                  ", quantidadeOperacoes=" + quantidadeOperacoes +
                  super.toString()+
                  '}';
     }

     public Float getFrequencia() {
          return frequencia;
     }

     public void setFrequencia(Float frequencia) {
          this.frequencia = frequencia;
     }

     public String getUnidadeFrequencia() {
          return unidadeFrequencia;
     }

     public void setUnidadeFrequencia(String unidadeFrequencia) {
          this.unidadeFrequencia = unidadeFrequencia;
     }

     public Integer getQuantidadeOperacoes() {
          return quantidadeOperacoes;
     }

     public void setQuantidadeOperacoes(Integer quantidadeOperacoes) {
          this.quantidadeOperacoes = quantidadeOperacoes;
     }


     @Override
     public Double calculaValorFrete() {
          return (200 + 0.5 * getDistanciaKm());
     }
}
