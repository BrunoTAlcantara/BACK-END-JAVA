package com.example.uniq.domain.repository;

import com.example.uniq.domain.entities.Aposta;
import com.example.uniq.domain.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ApostaRepository extends JpaRepository<Aposta,UUID> {


}
