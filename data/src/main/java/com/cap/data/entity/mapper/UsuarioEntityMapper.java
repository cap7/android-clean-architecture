package com.cap.data.entity.mapper;

import com.cap.data.entity.UsuarioEntity;
import com.cap.data.entity.UsuarioResponse;
import com.cap.domain.model.Usuario;

/**
 * Created by CAP on 23/10/2016.
 */

public class UsuarioEntityMapper extends Mapper<Usuario,UsuarioEntity> {

    @Override
    public UsuarioEntity map(Usuario value) {
        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setLoginUsuario(value.getLoginUsuario());
        usuarioEntity.setPasswordUsuario(value.getPasswordUsuario());
        return usuarioEntity;
    }

    @Override
    public Usuario reverseMap(UsuarioEntity value) {
        return null;
    }

    public Usuario mapUsurioResponse(UsuarioResponse value){
        Usuario usuario = new Usuario();

        usuario.setObjectId(value.getObjectId());
        usuario.setName(value.getName());
        usuario.setToken(value.getToken());
        usuario.setOwnerId(value.getOwnerId());

        usuario.setNombreUsuario(value.getNombreUsuario());
        usuario.setEmail(value.getEmail());
        usuario.setDescripcionUsuario(value.getDescripcionUsuario());
        return usuario;
    }
}
