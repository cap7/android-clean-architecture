package com.cap.presenter.navigation;

import android.content.Context;
import android.content.Intent;

import com.cap.presenter.view.ui.activity.RegistrarPersonaActivity;

/**
 * Created by CAP on 30/09/2016.
 */

public class Navigator {

    public void navigateToRegistrarPersona(Context context){
        Intent intentToRegistrarPersona = new Intent(context, RegistrarPersonaActivity.class);
        context.startActivity(intentToRegistrarPersona);
    }
}
