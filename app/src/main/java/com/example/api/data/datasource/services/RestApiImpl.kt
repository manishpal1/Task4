package com.ecourier.courier.data.datasource.network.services

import android.app.TaskStackBuilder.create
import android.content.Context
import android.net.ConnectivityManager
import android.util.Log

import com.example.api.data.datasource.response.ApiResponse

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import io.reactivex.Observable
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import java.net.URI.create
import java.util.*

class RestApiImpl constructor(
    var mNetworkService: NetworkService,
    var mContext: Context
) : RestApi {
    var context: Context

//    val type = object : TypeToken<ErrorResponse>() {}.type
    val gson = Gson()

    init {
        this.context = mContext
    }



override fun getApiString(): Observable<Response<ApiResponse>> {
    return Observable.create<Response<ApiResponse>> { emitter ->

//        if (!isThereInternetConnection()) {
//            emitter.onError(NetworkUnavailableException())
//            return@create
//        }
        val sessionEntity: Response<ApiResponse> =
            mNetworkService.getApiString().execute()

        if (sessionEntity.isSuccessful) {
            if (sessionEntity.body() != null) {
                emitter.onNext(sessionEntity)

                emitter.onComplete()
            } else {
                emitter.onError(UnknownError())
            }
        } else {
            val error = sessionEntity.errorBody()
//            Log.e("Error", "" + error)
//            val errorResponse: ErrorResponse? =
//                gson.fromJson(sessionEntity.errorBody()!!.charStream(), type)
//            emitter.onError(
//                ExceptionFactory.create(
//                    sessionEntity.code(),
//                    errorResponse?.message
//                )
//            )
        }
    }
}
}