package com.ecourier.courier.data.datasource.network.services

import com.example.api.data.datasource.response.ApiResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

interface NetworkService {


    @GET("employees")
        fun getApiString(): Call<ApiResponse>



}