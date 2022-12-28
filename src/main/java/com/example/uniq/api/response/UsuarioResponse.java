package com.example.uniq.api.response;

import com.example.uniq.domain.enums.TipoApostador;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;


public class UsuarioResponse {
    private UUID id;
    private String nome;
    private String email;
    private Date nascimento;
    private TipoApostador tipoApostador;

    private double banca;
    private double entradas;
    private double saidas;
    private Date createdAt;
    private LocalDateTime updatedAt;


    public UsuarioResponse() {
    }

    public UsuarioResponse(UUID id, String nome, String email, Date nascimento, TipoApostador tipoApostador, double banca, double entradas, double saidas, Date createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.tipoApostador = tipoApostador;
        this.banca = banca;
        this.entradas = entradas;
        this.saidas = saidas;
        this.nascimento = nascimento;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    public TipoApostador getTipoApostador() {
        return tipoApostador;
    }

    public void setTipoApostador(TipoApostador tipoApostador) {
        this.tipoApostador = tipoApostador;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
}
