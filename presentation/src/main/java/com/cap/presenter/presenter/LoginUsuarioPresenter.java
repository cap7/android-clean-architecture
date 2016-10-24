package com.cap.presenter.presenter;

import android.util.Log;

import com.cap.data.entity.mapper.UsuarioEntityMapper;
import com.cap.data.repository.LoginUsuarioDataRepository;
import com.cap.data.repository.datasource.DataStoreFactory;
import com.cap.domain.interactor.LoginUsuarioCallback;
import com.cap.domain.interactor.LoginUsuarioInteractor;
import com.cap.domain.model.Usuario;
import com.cap.domain.repository.LoginUsuarioRepository;
import com.cap.presenter.view.LoginUsuarioView;
import com.cap.presenter.viewmodel.UsuarioModel;
import com.cap.presenter.viewmodel.mapper.UsuarioModelMapper;

/**
 * Created by CAP on 23/10/2016.
 */

public class LoginUsuarioPresenter implements Presenter<LoginUsuarioView>,LoginUsuarioCallback {

    private UsuarioModelMapper usuarioModelMapper;
    private LoginUsuarioView loginUsuarioView;
    private LoginUsuarioInteractor loginUsuarioInteractor;



    @Override
    public void setView(LoginUsuarioView view) {
        this.loginUsuarioView = view;
        LoginUsuarioRepository loginUsuarioRepository
                = new LoginUsuarioDataRepository(
                new DataStoreFactory(loginUsuarioView.context()),new UsuarioEntityMapper());
        loginUsuarioInteractor = new LoginUsuarioInteractor(loginUsuarioRepository);
    }

    public void setDatosCredencialesUsuario(String cuentaUsuario,String claveUsuario){
        UsuarioModel usuarioModel = new UsuarioModel();
        usuarioModel.setLoginUsuario(cuentaUsuario);
        usuarioModel.setPasswordUsuario(claveUsuario);
        setLoginUsuarioPresenter(usuarioModel);
    }

    private void setLoginUsuarioPresenter(UsuarioModel usuarioModel){
        usuarioModelMapper = new UsuarioModelMapper();
        loginUsuarioInteractor.setLoginUsuarioInteractor(usuarioModelMapper.map(usuarioModel),this);
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void onLoginUsuarioSuccess(Usuario usuario) {
        Log.i("OK=",usuario.getToken().toString());
        this.loginUsuarioView.initLoadApp();
    }

    @Override
    public void onLoginUsuarioError(String mensaje) {
        Log.i("ERROR LOGIN=",mensaje);
    }
}
