package com.example.uniq.api.response;

import com.example.uniq.domain.entities.Metodo;
import com.example.uniq.domain.entities.Usuario;
import com.example.uniq.domain.enums.Status;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class ApostaResponse {

    private UUID id;
    private String nome;
    private String jogo;
    private double od;
    private double valor;
    private Status status;
    private Date createdAt;
    private LocalDateTime updatedAt;
    private Usuario usuario;
    private Metodo metodo;

    public ApostaResponse() {
    }

    public ApostaResponse(UUID id, String nome, String jogo, double od, double valor, Status status, Date createdAt, LocalDateTime updatedAt, Usuario usuario, Metodo metodo) {
        this.id = id;
        this.nome = nome;
        this.jogo = jogo;
        this.od = od;
        this.valor = valor;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.usuario = usuario;
        this.metodo = metodo;
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

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

    public double getOd() {
        return od;
    }

    public void setOd(double od) {
        this.od = od;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Metodo getMetodo() {
        return metodo;
    }

    public void setMetodo(Metodo metodo) {
        this.metodo = metodo;
    }
}
