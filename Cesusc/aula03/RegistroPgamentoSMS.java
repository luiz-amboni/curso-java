package aula03;

public class RegistroPgamentoSMS implements RegistroPagamento {
    @Override
    public String geraLog() {
        return "Log SMS";
    }

    @Override
    public String geraCodigoReceita() {
        return null;
    }

    @Override
    public String gravaLog() {
        return null;
    }
}
