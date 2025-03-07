package model;

import java.util.ArrayList;
import java.util.List;

import util.Util;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String endereco;
    private String telefone;
    private List<Endereco> enderecos = new ArrayList<>();

    public Usuario(String nome, String email, String senha, String endereco, String telefone) {
        this.id = Util.gerarId();
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", endereco="
                + endereco + ", telefone=" + telefone + ", enderecos=" + enderecos + "]";
    }

    

    
}
