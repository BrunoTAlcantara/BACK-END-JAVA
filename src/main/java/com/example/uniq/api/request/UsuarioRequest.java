package com.example.uniq.api.request;

import com.example.uniq.domain.enums.TipoApostador;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;

import java.util.Date;

public class UsuarioRequest {
    @NotBlank(message = "Nome Obrigatorio")
    private String nome;
    @Email(message = "Email Obrigatorio")
    private String email;
    @NotBlank(message = "Senha Obrigatorio")
    private String senha;

    @Past
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date nascimento;
    private TipoApostador tipoApostador;

    @Positive
    private double banca;

    private double entradas;
    private double saidas;

    public UsuarioRequest() {
    }

    public UsuarioRequest(String nome, Date nascimento, String email, String senha, TipoApostador tipoApostador, double banca, double entradas, double saidas) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipoApostador = tipoApostador;
        this.banca = banca;
        this.entradas = entradas;
        this.saidas = saidas;
        this.nascimento = nascimento;
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

    public TipoApostador getTipoApostador() {
        return tipoApostador;
    }

    public void setTipoApostador(TipoApostador tipoApostador) {
        this.tipoApostador = tipoApostador;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public double getBanca() {
        return banca;
    }

    public void setBanca(double banca) {
        this.banca = banca;
    }

    public double getEntradas() {
        return entradas;
    }

    public void setEntradas(double entradas) {
        this.entradas = entradas;
    }

    public double getSaidas() {
        return saidas;
    }

    public void setSaidas(double saidas) {
        this.saidas = saidas;
    }
}
