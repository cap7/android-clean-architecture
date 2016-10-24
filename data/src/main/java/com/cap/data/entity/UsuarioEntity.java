package com.cap.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by CAP on 23/10/2016.
 */

public class UsuarioEntity {

    @SerializedName("login")
    @Expose
    private String loginUsuario;
    @SerializedName("password")
    @Expose
    private String passwordUsuario;

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }
}
