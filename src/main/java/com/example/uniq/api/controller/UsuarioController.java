package com.example.uniq.api.controller;

import com.example.uniq.api.mapper.UsuarioMapper;
import com.example.uniq.api.request.UsuarioRequest;
import com.example.uniq.api.response.UsuarioResponse;
import com.example.uniq.domain.entities.Usuario;
import com.example.uniq.domain.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/usuario")
public class UsuarioControllerr {

    private final UsuarioService service;
    @PostMapping
    public ResponseEntity<UsuarioResponse> salvar(@RequestBody UsuarioRequest request){

        Usuario usuario = UsuarioMapper.toUsuarioRequest(request);

        Usuario usuarioSalvo = service.salvar(usuario);
        UsuarioResponse usuarioResponse = UsuarioMapper.toUsuarioResponse(usuarioSalvo);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioResponse);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listarTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(service.listarTodos());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarPorId(  @PathVariable  UUID id){

        Optional<Usuario> optionalUsuario = service.buscarPorId(id);

        if(optionalUsuario.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.status(HttpStatus.OK).body(optionalUsuario.get());
    }
    @PutMapping
    public ResponseEntity<Usuario> alterar(@RequestBody Usuario usuario){
        Usuario usuarioSalvo = service.salvar(usuario);
        return ResponseEntity.status(HttpStatus.OK).body(usuarioSalvo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> deletar(@PathVariable  UUID id){
        Optional<Usuario> optionalUsuario = service.buscarPorId(id);
        service.deletar(id);
        return ResponseEntity.status(HttpStatus.OK).body(optionalUsuario.get());
    }




}
