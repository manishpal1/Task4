package com.ecourier.courier.data.datasource.network.services


import com.example.api.data.datasource.response.ApiResponse
import io.reactivex.Observable
import okhttp3.MultipartBody
import retrofit2.Response
import java.util.*

/**
 * Created by Pratiksha on 26/3/21.
 */
interface RestApi {


    fun getApiString():Observable<Response<ApiResponse>>

}