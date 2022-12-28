package com.example.uniq.domain.service;

import com.example.uniq.domain.entities.Aposta;
import com.example.uniq.domain.entities.Usuario;
import com.example.uniq.domain.repository.ApostaRepository;
import com.example.uniq.exception.BusinessException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Transactional
@Service
public class ApostaService {

    private final ApostaRepository repository;
    private final UsuarioService usuarioService;


    public Aposta salvar(Aposta aposta) {
        Optional<Usuario> optionalUsuario = usuarioService.buscarPorId(aposta.getUsuario().getId());
        if (optionalUsuario.isEmpty()) {
            throw new BusinessException("Usuario nao existe");
        }
        return repository.save(aposta);
    }

    public List<Aposta> listarTodos() {
        return repository.findAll();
    }

    public Optional<Aposta> buscarPorId(UUID id) {
        return repository.findById(id);
    }

    public void deletar(UUID id) {
        repository.deleteById(id);
    }


}
