package Service;

import Pagamento.IPagamento;

public class PagamentoService {

    public void receberPagamento(IPagamento metodo, double valor) {

        if (metodo.ValidaDados()) {
            metodo.executaPagamento(valor);
        } else {
            throw new RuntimeException("Método de pagamento inválido");
        }
    }

}
