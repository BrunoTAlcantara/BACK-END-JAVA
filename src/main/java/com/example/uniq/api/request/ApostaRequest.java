package com.example.uniq.api.request;

import com.example.uniq.domain.enums.Status;
import jakarta.validation.constraints.NotBlank;

public class ApostaRequest {
    @NotBlank(message = "Nome Obrigatorio")
    private String nome;

    private String jogo;

    private double od;

    private double valor;

    private Status status;

    public ApostaRequest() {
    }

    public ApostaRequest(String nome, String jogo, double od, double valor, Status status) {
        this.nome = nome;
        this.jogo = jogo;
        this.od = od;
        this.valor = valor;
        this.status = status;
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
}
