package aula03;

public class Menu {

    public static void main(String[] args) {
        System.out.println("Valor Convertido: "+ PgamentoGas.getConversao(300.0,5.2));


        PagamentoMarmitas meuPagamento = new PagamentoMarmitas();
        System.out.println(meuPagamento.validaCodigoBarra("AAAABBB1111"));
        System.out.println(meuPagamento.validaCodigoBarra("AAAA11"));

        PgamentoGas meuGas = new PgamentoGas();
        System.out.println(meuGas.validaCodigoBarra("AAAA11"));
        System.out.println(meuGas.validaCodigoBarra("GASAAAA11"));

        meuGas.setValorPagamento(500.0);
        meuGas.converteParaDolar(5.20);
        System.out.println("Pagamento: "+ meuGas.getValorPagamento());
        System.out.println("Em Dolar: "+ meuGas.getValorPagamentoDolar());

        RegistroPagamento meuRegistro = new RegistroPgamentoSMS();
        System.out.println("Log Gerado "+ meuRegistro.geraLog());
    }

}
