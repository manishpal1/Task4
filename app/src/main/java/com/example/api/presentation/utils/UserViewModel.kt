package com.example.api.presentation.utils

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.api.domain.Entity.UserEntity
import com.example.api.domain.interactor.ApiUc
import com.google.gson.Gson
import io.reactivex.observers.DisposableObserver

class UserViewModel(var apiUC: ApiUc):ViewModel() {
    var mMutableLiveDataUserLists = MutableLiveData<UserModel>()
    var gson = Gson()

    fun getUserDataResponse(): LiveData<UserModel> {
        return mMutableLiveDataUserLists
    }

    fun getUserData() {
        apiUC.execute(object : DisposableObserver<UserEntity>() {
            override fun onComplete() {
                Log.d("TAG--> ", "onComplete")

            }

            override fun onNext(response: UserEntity) {
                mMutableLiveDataUserLists.value = UserModel.success(response)
            }

            override fun onError(e: Throwable) {
                Log.d("TAG--> ", "onError" + e.message)
                mMutableLiveDataUserLists.value = UserModel.error(e)
            }


        }, Unit)
    }

}