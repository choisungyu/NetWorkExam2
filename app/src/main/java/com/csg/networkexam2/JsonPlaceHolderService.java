package com.csg.networkexam2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderService {
    @GET("users")
    Call<List<User>> listUsers();
}
