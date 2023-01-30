package Models;

import java.time.LocalDate;

public class Funcionario implements Model{

    private Long id;
    private String username;
    private String Password;
    private String Nome;
    private LocalDate dtContratacao;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public LocalDate getDtContratacao() {
        return dtContratacao;
    }

    public void setDtContratacao(LocalDate dtContratacao) {
        this.dtContratacao = dtContratacao;
    }
}
