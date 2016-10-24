package com.cap.presenter.view.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.cap.presenter.R;
import com.cap.presenter.presenter.LoginUsuarioPresenter;
import com.cap.presenter.view.LoginUsuarioView;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by CAP on 23/10/2016.
 */

public class LoginUsuarioFragement extends BaseFragment implements LoginUsuarioView{

    public interface ListenerLoadApp{
        void renderInitLoasApp();
    }

    @BindView(R.id.etCuenta)
    EditText cuentaEt;

    @BindView(R.id.etClave)
    EditText claveEt;

    @BindView(R.id.btIniciarSesion)
    Button iniciarSessionBt;

    private LoginUsuarioPresenter loginUsuarioPresenter;

    private ListenerLoadApp renderLoadApp;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_login_usuario;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof ListenerLoadApp){
            renderLoadApp = (ListenerLoadApp) context;
        }
    }

    @Override
    public void initViewFragment(Bundle bundle) {
        super.initViewFragment(bundle);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loginUsuarioPresenter = new LoginUsuarioPresenter();
        loginUsuarioPresenter.setView(this);
    }

    @OnClick(R.id.btIniciarSesion)
    void onClickIniciarSession(){
        loginUsuarioPresenter.setDatosCredencialesUsuario(
                cuentaEt.getText().toString(),
                claveEt.getText().toString());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void initLoadApp() {
        renderLoadApp.renderInitLoasApp();
    }

    @Override
    public void showMensajCampoCredenciales(String mensaje) {

    }

    @Override
    public void showMensajCampoCuenta(String mensaje) {

    }

    @Override
    public void showMensajCampoClave(String mensaje) {

    }

    @Override
    public void showMensajeErrorLogin(String mensaje) {

    }

    @Override
    public Context context() {
        return getActivity().getApplication();
    }
}
