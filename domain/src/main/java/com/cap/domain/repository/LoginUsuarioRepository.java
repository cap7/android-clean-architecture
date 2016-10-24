package com.cap.domain.repository;

import com.cap.domain.interactor.LoginUsuarioCallback;
import com.cap.domain.model.Usuario;

/**
 * Created by CAP on 23/10/2016.
 */

public interface LoginUsuarioRepository {

    void domainLoginUsuarioRepository(Usuario usuario, LoginUsuarioCallback loginUsuarioCallback);


}
