package com.example.api.data.repository

import com.ecourier.courier.data.datasource.mapper.UserDataMapper
import com.ecourier.courier.data.datasource.network.services.RestApi

import com.example.api.domain.Entity.UserEntity
import com.example.api.domain.repository.UserRepository

import io.reactivex.Observable


class UserDataRepository constructor(
    var mRestApi: RestApi,
    var mUserDataMapper: UserDataMapper
) : UserRepository {
    override fun doApi(): Observable<UserEntity> {
        return mRestApi.getApiString().map(mUserDataMapper::getUserData)
    }
    }




