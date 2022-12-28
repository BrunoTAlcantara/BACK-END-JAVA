package com.example.uniq.domain.service;

import com.example.uniq.api.request.UserRoleRequest;
import com.example.uniq.domain.entities.Role;
import com.example.uniq.domain.entities.Usuario;
import com.example.uniq.domain.repository.UsuarioRepository;
import com.example.uniq.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserRoleService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario execute(UserRoleRequest userRoleRequest) {

        Optional<Usuario> userExist = usuarioRepository.findById(userRoleRequest.idUser);
        List<Role> roles = new ArrayList<>();

        System.out.println("#####################");
        System.out.println(userExist);

        if (userExist.isEmpty()) {
            throw new BusinessException("Usuario nao existe!");
        }


        roles = userRoleRequest.getIdRoles().stream().map(role -> {
            Role role1 = new Role(role);
            return role1;
        }).collect(Collectors.toList());

        Usuario user = userExist.get();

        user.setRoles(roles);

        usuarioRepository.save(user);

        return user;
    }

}
