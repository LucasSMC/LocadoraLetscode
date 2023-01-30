package Models;

import java.util.List;

import Enums.TipoPessoa;

public abstract class Cliente implements Model {
    private Long id;
    private String nome;
    private TipoPessoa tipo;
    private List<Veiculos> alugados;
    private String habilitacao;
    private List<Contratos> contrato;

    public Cliente(String nome, TipoPessoa tipo, String habilitacao) {
        this.nome = nome;
        this.tipo = tipo;
        this.habilitacao = habilitacao;
    }

    public String getNome() {
        return nome;
    }

    public TipoPessoa getTipo() {
        return tipo;
    }

    public List<Veiculos> getAlugados() {
        return alugados;
    }

    public void setAlugados(List<Veiculos> alugados) {
        this.alugados = alugados;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(TipoPessoa tipo) {
        this.tipo = tipo;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public List<Contratos> getContrato() {
        return contrato;
    }

    public void setContrato(List<Contratos> contrato) {
        this.contrato = contrato;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
