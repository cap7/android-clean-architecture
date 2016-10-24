package com.cap.domain.interactor;

import com.cap.domain.model.Usuario;
import com.cap.domain.repository.LoginUsuarioRepository;

/**
 * Created by CAP on 23/10/2016.
 */

public class LoginUsuarioInteractor {

    private final LoginUsuarioRepository loginUsuarioRepository;

    public LoginUsuarioInteractor(LoginUsuarioRepository loginUsuarioRepository) {
        this.loginUsuarioRepository = loginUsuarioRepository;
    }

    public void setLoginUsuarioInteractor(Usuario usuario,LoginUsuarioCallback loginUsuarioCallback){
        loginUsuarioRepository.domainLoginUsuarioRepository(usuario,loginUsuarioCallback);
    }
}
