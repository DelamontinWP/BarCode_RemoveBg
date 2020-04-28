package com.delamontinwp.barcode_removebg.helper;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class AuthentificationInterceptor implements Interceptor {

    //bagian delamontin
    private String authToken;

    public AuthentificationInterceptor(String authToken) {
        this.authToken = authToken;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();
        Request.Builder builder = original.newBuilder()
                .header("X-API-Key", authToken);
        Request request = builder.build();
        return chain.proceed(request);
    }
}
