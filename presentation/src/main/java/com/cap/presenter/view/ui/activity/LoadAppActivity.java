package com.cap.presenter.view.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.cap.presenter.R;
import com.cap.presenter.navigation.Navigator;
import com.cap.presenter.presenter.ListarPersonaPresenter;
import com.cap.presenter.view.ListarPersonaView;
import com.cap.presenter.view.ui.fragment.ListarPersonaFragment;
import com.cap.presenter.view.ui.fragment.LoadAppFragment;
import com.cap.presenter.viewmodel.PersonaModel;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created by CAP on 07/10/2016.
 */

public class LoadAppActivity extends BaseActivity implements LoadAppFragment.RenderListarPersona /*implements ListarPersonaView*/  {

    /*@BindView(R.id.lyLoadRegistrarPersona)
    RelativeLayout linearLayoutLoad;

    private ListarPersonaPresenter listarPersonaPresenter;*/

    private Navigator navigator;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_load_app;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        if(savedInstanceState == null){
            showFragment(new LoadAppFragment(),R.id.frLoadApp,null);
        }
        /*listarPersonaPresenter = new ListarPersonaPresenter();
        listarPersonaPresenter.setView(this);
        if(savedInstanceState == null){
            listarPersonaPresenter.getListarPersonaPresenter();
        }*/
    }

    @Override
    public void renderListarPersonaItem(ArrayList<PersonaModel> renderListaPersona) {
        navigator = new Navigator();
        if(renderListaPersona !=null) {
            navigator.navigateToListarPersona(LoadAppActivity.this, renderListaPersona);
        }
        finish();
    }

    //@Override
    //public void listenerListarPersona(ArrayList<PersonaModel> renderListaPersona) {
        /*Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("ListarPersona", renderListaPersona);
        if(bundle!=null) {
            //hideLoading();
            showFragment(new ListarPersonaFragment(), R.id.frListarPersona, bundle);
        }*/
    //}

    /*@Override
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
    protected void onDestroy() {
        super.onDestroy();
        listarPersonaPresenter.destroy();
    }

    @Override
    public Context getContext() {
        return this.getApplicationContext();
    }*/
}
