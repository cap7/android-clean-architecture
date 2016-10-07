package com.cap.presenter.view.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.cap.presenter.R;
import com.cap.presenter.navigation.Navigator;
import com.cap.presenter.presenter.ListarPersonaPresenter;
import com.cap.presenter.view.ListarPersonaView;
import com.cap.presenter.view.ui.fragment.ListarPersonaFragment;
import com.cap.presenter.viewmodel.PersonaModel;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

public class ListarPersonaActivity extends BaseActivity implements ListarPersonaView {

    @BindView(R.id.lyLoadRegistrarPersona)
    RelativeLayout linearLayoutLoad;

    private Navigator navigator;


    private ListarPersonaPresenter listarPersonaPresenter;


    @Override
    protected int getLayoutId() {
        return R.layout.activity_listar_persona;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);

        listarPersonaPresenter = new ListarPersonaPresenter();
        listarPersonaPresenter.setView(this);
        if(savedInstanceState == null){
            listarPersonaPresenter.getListarPersonaPresenter();
        }
    }

    @OnClick(R.id.fabOpenRegistrarPersona)
    void onClickRegistrarPersona(){
        navigator = new Navigator();
        navigator.navigateToRegistrarPersona(ListarPersonaActivity.this);
    }

    @Override
    public void listenerListarPersona(ArrayList<PersonaModel> renderListaPersona) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("ListarPersona", renderListaPersona);
        if(bundle!=null) {
            //hideLoading();
            showFragment(new ListarPersonaFragment(), R.id.frListarPersona, bundle);
        }
    }

    @Override
    public void showLoading() {
        this.linearLayoutLoad.setVisibility(View.VISIBLE);
        this.setProgressBarIndeterminate(true);
    }

    @Override
    public void hideLoading() {
        linearLayoutLoad.setVisibility(View.GONE);
        this.setProgressBarIndeterminateVisibility(false);
    }


    @Override
    public Context getContext() {
        return null;
    }
}
