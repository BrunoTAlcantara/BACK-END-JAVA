package com.example.uniq.domain.entities;

import com.example.uniq.domain.enums.Role;
import com.example.uniq.domain.enums.TipoApostador;
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
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID id;
    @Column(name="nome",  nullable = false)
    private String nome;
    @Column(name="email",  nullable = false, unique = true)
    private String email;
    @Column(name="senha", nullable = false)
    private String senha;
    @Column(name="tipo_apostador", nullable = false)
    private TipoApostador tipoApostador;
    @Column(name="role", nullable = false)
    private Role role;
    @Column(name="banca", nullable = false)
    private double banca;

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
