package com.example.uniq.api.mapper;

import com.example.uniq.api.request.UsuarioRequest;
import com.example.uniq.api.response.UsuarioResponse;
import com.example.uniq.domain.entities.Usuario;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class UsuarioMapper {

    public final ModelMapper mapper;

    public Usuario toUsuarioRequest(UsuarioRequest request) {

        return mapper.map(request, Usuario.class);
    }

    public UsuarioResponse toUsuarioResponse(Usuario response) {
        return mapper.map(response, UsuarioResponse.class);
    }


}
