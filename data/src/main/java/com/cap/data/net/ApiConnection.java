package com.cap.data.net;

import java.util.concurrent.Callable;

/**
 * Created by CAP on 30/09/2016.
 */

public interface ApiConnection extends Callable<RestApi>{

    @Override
    RestApi call() throws Exception;

    RestApi requestSyncCall();
}
