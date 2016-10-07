package com.cap.presenter.presenter;

import android.util.Log;

import com.cap.data.entity.mapper.PersonaEntityMapper;
import com.cap.data.repository.ListarPersonaDataRepository;
import com.cap.data.repository.datasource.DataStoreFactory;
import com.cap.domain.interactor.ListarPersonaCallback;
import com.cap.domain.interactor.ListarPersonaInteractor;
import com.cap.domain.model.Persona;
import com.cap.domain.repository.ListarPersonaRepository;
import com.cap.presenter.view.ListarPersonaView;
import com.cap.presenter.viewmodel.PersonaModel;
import com.cap.presenter.viewmodel.mapper.PersonaModelMapper;

import java.util.ArrayList;

/**
 * Created by CAP on 30/09/2016.
 */

public class ListarPersonaPresenter implements Presenter<ListarPersonaView>, ListarPersonaCallback {

    private ListarPersonaInteractor listarPersonaInteractor;
    private ListarPersonaView listarPersonaView;
    private PersonaModelMapper personaModelMapper;
    private ArrayList<PersonaModel> personaModelArrayList;


    @Override
    public void setView(ListarPersonaView view) {
        this.listarPersonaView =  view;
        ListarPersonaRepository listarPersonaRepository = new ListarPersonaDataRepository(new DataStoreFactory(this.listarPersonaView.getContext()),new PersonaEntityMapper());
        listarPersonaInteractor = new ListarPersonaInteractor(listarPersonaRepository);

    }

    public void getListarPersonaPresenter(){
        //this.showViewLoading();
        listarPersonaInteractor.getListarPersonaInteractor(this);
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

    private void showViewLoading() {
        listarPersonaView.showLoading();
    }

    private void hideViewLoading() {
        listarPersonaView.hideLoading();
    }


    @Override
    public void onListarPersonaSuccess(ArrayList<Persona> persona) {

        personaModelMapper = new PersonaModelMapper();
        personaModelArrayList = personaModelMapper.mapListPersonaModel(persona);
        this.listarPersonaView.listenerListarPersona(personaModelArrayList);
        this.hideViewLoading();

    }

    @Override
    public void onListarPersonaError(String mensaje) {
        Log.i("ERROR=",mensaje.toString());
    }
}
