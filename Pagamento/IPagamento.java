package Pagamento;

public interface IPagamento {

    boolean ValidaDados();

    boolean executaPagamento(double valor);
}
