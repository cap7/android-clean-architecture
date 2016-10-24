package com.cap.presenter.view.ui.activity;

import android.os.Bundle;

import com.cap.presenter.R;
import com.cap.presenter.navigation.Navigator;
import com.cap.presenter.view.ui.fragment.LoginUsuarioFragement;

/**
 * Created by CAP on 23/10/2016.
 */

public class LoginUsuarioActivity extends BaseActivity implements LoginUsuarioFragement.ListenerLoadApp{

    private Navigator navigator;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login_usuario;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        if(savedInstanceState == null){
            showFragment(new LoginUsuarioFragement(),R.id.frIniciarSession,null);
        }

    }

    @Override
    public void renderInitLoasApp() {
        navigator = new Navigator();
        navigator.navigateToLoadApp(LoginUsuarioActivity.this);

    }
}
