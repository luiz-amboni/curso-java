package aula03;

public class PgamentoGas extends Pagamento {

    @Override
    public boolean validaCodigoBarra(String codigo) {
        return codigo.contains("GAS");
    }
}
