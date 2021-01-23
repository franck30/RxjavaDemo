package com.skysoft.rxjvademoapp.retrofit;

import com.skysoft.rxjvademoapp.model.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface RetrofitApi {
    @GET("posts")
    Observable<List<Post>> getPosts();
}
