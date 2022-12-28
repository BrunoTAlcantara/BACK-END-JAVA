package com.example.uniq.domain.service;

import com.example.uniq.domain.entities.Usuario;
import com.example.uniq.domain.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
@RequiredArgsConstructor
public class UsuarioService {
    private  final UsuarioRepository repository ;

    public Usuario salvar(Usuario usuario){

    }

    public List<Usuario> listarTodos(){
            return repository.findAll();
    }
    public Optional<Usuario> buscarPorId(UUID id){
            return repository.findById(id);
    }

    public void deletar(UUID id){

        repository.deleteById(id);

    }


}
