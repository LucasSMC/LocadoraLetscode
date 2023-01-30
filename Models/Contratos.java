package Models;

import Pagamento.IPagamento;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Contratos implements Model {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Veiculos veiculo;
    private LocalDate dataAluguel;
    private LocalDate dataDevolucao;
    private Period tempoAluguel;
    private String Finalidade;

    private IPagamento metodo;
    private Float ValorParcial;
    private Float valorTotal;

    public Veiculos getVeiculo() {
        return veiculo;
    }

    public IPagamento getMetodo() {
        return metodo;
    }

    public void setMetodo(IPagamento metodo) {
        this.metodo = metodo;
    }

    public void setVeiculo(Veiculos veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDate getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(LocalDate dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Period getTempoAluguel() {
        return tempoAluguel;
    }

    public void setTempoAluguel(Period tempoAluguel) {
        this.tempoAluguel = tempoAluguel;
    }

    public String getFinalidade() {
        return Finalidade;
    }

    public void setFinalidade(String finalidade) {
        Finalidade = finalidade;
    }

    public Float getValorParcial() {
        return ValorParcial;
    }

    public void setValorParcial(Float valorParcial) {
        ValorParcial = valorParcial;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }
}
