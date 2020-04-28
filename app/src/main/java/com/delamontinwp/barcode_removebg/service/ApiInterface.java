package com.delamontinwp.barcode_removebg.service;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiInterface {
    //bagian delamontin
    @Multipart
    @POST("removebg")
    Call<ResponseBody> Upload(@Part MultipartBody.Part photo);
}
