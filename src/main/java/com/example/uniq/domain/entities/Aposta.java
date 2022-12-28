package com.example.uniq.domain.entities;

import com.example.uniq.domain.enums.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;
@Getter
@Setter
@Entity
@Table(name="aposta")
public class Aposta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID id;
    @Column(name="nome",  nullable = false)
    private String nome;
    @Column(name="jogo",  nullable = false, unique = true)
    private String jogo;
    @Column(name="od", nullable = false)
    private double od;
    @Column(name="valor", nullable = false)
    private double valor;
    @Column(name="status", nullable = false)
    private Status status;

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;


    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Metodo metodo;

}
