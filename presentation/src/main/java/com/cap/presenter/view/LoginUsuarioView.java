package com.cap.presenter.view;

/**
 * Created by CAP on 23/10/2016.
 */

public interface LoginUsuarioView extends BaseView{

    void initLoadApp();

    void showMensajCampoCredenciales(String mensaje);

    void showMensajCampoCuenta(String mensaje);

    void showMensajCampoClave(String mensaje);

    void showMensajeErrorLogin(String mensaje);
}
