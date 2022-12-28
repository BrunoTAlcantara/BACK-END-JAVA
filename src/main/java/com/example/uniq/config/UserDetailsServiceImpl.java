package com.example.uniq.config;

import com.example.uniq.domain.entities.Usuario;
import com.example.uniq.domain.repository.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    final UsuarioRepository usuarioRepository;

    public UserDetailsServiceImpl(UsuarioRepository usuarioRepository) {
        System.out.println("CHEGAAQUII2");
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("CHEGAAQUII");

        Usuario userModel = usuarioRepository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("Este email nao existe:" + username));


        return UserPrincipal.create(userModel);
    }
}
