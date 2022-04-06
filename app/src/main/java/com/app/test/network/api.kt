package com.app.test.network

import retrofit2.Response
import retrofit2.http.GET

interface api {
    @GET("posts/")
    suspend fun getQuotes() : Response<PostListModel>
}