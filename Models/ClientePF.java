package Models;

import java.util.Date;

import Enums.Sexo;
import Enums.TipoPessoa;

public class ClientePF extends Cliente {
    private Date dtNascimento;
    private Sexo sexo;
    private String profissao;
    private String CPF;

    public ClientePF(String nome, TipoPessoa tipo, String habilitacao) {
        super(nome, tipo, habilitacao);
        // TODO Auto-generated constructor stub
    }

    public ClientePF(String nome, TipoPessoa tipo, Date dtNascimento, Sexo sexo, String profissao, String cPF,
            String habilitacao) {
        super(nome, tipo, habilitacao);
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
        this.profissao = profissao;
        CPF = cPF;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getCPF() {
        return CPF;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }
}
