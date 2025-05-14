package com.zeynepkeskin.retrofitcrypto.service;

import com.zeynepkeskin.retrofitcrypto.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI  {

    @GET("atilsamancioglu/K21-JSONDataSet/refs/heads/master/crypto.json")
    Observable<List<CryptoModel>> getData();

    //Call<List<CryptoModel>> getData();


}
