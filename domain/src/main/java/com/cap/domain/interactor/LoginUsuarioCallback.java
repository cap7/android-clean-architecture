package com.cap.domain.interactor;

import com.cap.domain.model.Usuario;

/**
 * Created by CAP on 23/10/2016.
 */

public interface LoginUsuarioCallback {

    void onLoginUsuarioSuccess(Usuario usuario);
    void onLoginUsuarioError(String mensaje);

}
