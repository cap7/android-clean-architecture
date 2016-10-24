package com.cap.data.repository;

import com.cap.data.entity.UsuarioEntity;
import com.cap.data.entity.UsuarioResponse;
import com.cap.data.entity.mapper.UsuarioEntityMapper;
import com.cap.data.repository.datasource.DataStore;
import com.cap.data.repository.datasource.DataStoreFactory;
import com.cap.domain.interactor.LoginUsuarioCallback;
import com.cap.domain.model.Usuario;
import com.cap.domain.repository.LoginUsuarioRepository;
import com.cap.domain.repository.RepositoryCallback;

/**
 * Created by CAP on 23/10/2016.
 */

public class LoginUsuarioDataRepository implements LoginUsuarioRepository {

    private final DataStoreFactory dataStoreFactory;
    private final UsuarioEntityMapper usuarioEntityMapper;

    public LoginUsuarioDataRepository(DataStoreFactory dataStoreFactory, UsuarioEntityMapper usuarioEntityMapper) {
        this.dataStoreFactory = dataStoreFactory;
        this.usuarioEntityMapper = usuarioEntityMapper;
    }

    @Override
    public void domainLoginUsuarioRepository(Usuario usuario, final LoginUsuarioCallback loginUsuarioCallback) {
        final DataStore dataStore =  dataStoreFactory.createDataStore();
        dataStore.dataLoginUsuario(usuarioEntityMapper.map(usuario), new RepositoryCallback() {
            @Override
            public void onError(Object object) {
                String message = "";
                if(object!=null){
                    message= object.toString();
                }
                loginUsuarioCallback.onLoginUsuarioError(message);
            }

            @Override
            public void onSuccess(Object object) {
                UsuarioResponse usuarioResponse = (UsuarioResponse) object;
                loginUsuarioCallback.onLoginUsuarioSuccess(usuarioEntityMapper.mapUsurioResponse(usuarioResponse));
            }
        });
    }
}
