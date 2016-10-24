package com.cap.presenter.viewmodel.mapper;

import com.cap.data.entity.mapper.Mapper;
import com.cap.domain.model.Usuario;
import com.cap.presenter.viewmodel.UsuarioModel;

/**
 * Created by CAP on 23/10/2016.
 */

public class UsuarioModelMapper extends Mapper<UsuarioModel,Usuario> {

    @Override
    public Usuario map(UsuarioModel value) {
        Usuario usuario = new Usuario();
        usuario.setLoginUsuario(value.getLoginUsuario());
        usuario.setPasswordUsuario(value.getPasswordUsuario());

        usuario.setObjectId(value.getObjectId());
        usuario.setName(value.getName());
        usuario.setToken(value.getToken());
        usuario.setOwnerId(value.getOwnerId());

        usuario.setNombreUsuario(value.getNombreUsuario());
        usuario.setEmail(value.getEmail());
        usuario.setDescripcionUsuario(value.getDescripcionUsuario());

        return usuario;
    }

    @Override
    public UsuarioModel reverseMap(Usuario value) {
        return null;
    }
}
