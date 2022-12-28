package com.example.uniq.domain.service;

import com.example.uniq.domain.repository.UsuarioRepository;
import com.example.uniq.domain.entities.Usuario;
import com.example.uniq.exception.BusinessException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UsuarioService {
    private  final UsuarioRepository repository ;

    @Autowired
    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario salvar(Usuario usuario){
        Optional<Usuario> emailExist = repository.findByEmail(usuario.getEmail());

        if(emailExist.isPresent()){
            throw new BusinessException("mensagem de error");
        }

        return repository.save(usuario);


    }

    public List<Usuario> listarTodos(){
            return repository.findAll();
    }

    public Optional<Usuario> buscarPorId( UUID id){
            return repository.findById(id);
    }

    public void deletar(UUID id){
        repository.deleteById(id);
    }


}
