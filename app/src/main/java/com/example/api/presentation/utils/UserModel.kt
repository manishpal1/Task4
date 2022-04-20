package com.example.api.presentation.utils

import com.ecourier.courier.presentation.enums.Status
import com.example.api.domain.Entity.UserEntity
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserModel(status: Status, var userListEntity: UserEntity?, var error: Throwable?) {
    @SerializedName("success")
    @Expose
    private var success: Boolean? = null
    @SerializedName("message")
    @Expose
    var message: String? = null

    @SerializedName("Token")
    @Expose
    var token: String? = null

    var status: Status? = status


    companion object {

        fun success(response: UserEntity): UserModel {
            return UserModel(
                Status.SUCCESS,
                response,
                null
            )
        }

        fun error(error: Throwable): UserModel {
            return UserModel(
                Status.ERROR,
                null,
                error
            )
        }
    }
}