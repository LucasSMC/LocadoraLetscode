package Pagamento;

import java.util.Random;

public class CartaoCredito implements IPagamento {

    public String numero;
    public String cvc;
    public String vencimento;
    public String titular;
    public String cpfTitular;

    public CartaoCredito() {
    }

    public CartaoCredito(String numero, String cvc, String vencimento, String titular, String cpfTitular) {
        this.numero = numero;
        this.cvc = cvc;
        this.vencimento = vencimento;
        this.titular = titular;
        this.cpfTitular = cpfTitular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    @Override
    public boolean ValidaDados() {
        System.out.println("HugaBunga mim valida Cartão hurdur");
        if (numero.isEmpty() || cvc.isEmpty() || vencimento.isEmpty() || titular.isEmpty() || cpfTitular.isEmpty())
            return false;
        return true;
    }

    @Override
    public boolean executaPagamento(double valor) {
        Random yay = new Random();
        return yay.nextBoolean();
    }

}
