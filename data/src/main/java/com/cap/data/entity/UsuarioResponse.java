package com.cap.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by CAP on 23/10/2016.
 */

public class UsuarioResponse extends BaseResponse{
    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("user-token")
    @Expose
    private String token;

    @SerializedName("ownerId")
    @Expose
    private String ownerId;

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("objectId")
    @Expose
    private String objectId;

    @SerializedName("nombre")
    @Expose
    private String nombreUsuario;

    @SerializedName("descripcion")
    @Expose
    private String descripcionUsuario;

    public String getDescripcionUsuario() {
        return descripcionUsuario;
    }

    public void setDescripcionUsuario(String descripcionUsuario) {
        this.descripcionUsuario = descripcionUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
