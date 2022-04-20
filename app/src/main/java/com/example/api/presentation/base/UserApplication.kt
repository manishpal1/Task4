package com.example.api.presentation.base

import android.app.Application
import android.util.Log
import androidx.room.Room

import com.ecourier.courier.presentation.di.PostModule
import com.ecourier.courier.presentation.di.networkModule

import com.facebook.stetho.Stetho
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal
import com.google.firebase.messaging.FirebaseMessaging
import io.reactivex.internal.util.NotificationLite.isComplete
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class UserApplication : Application(){

    companion object {
        private lateinit var instance: UserApplication
        fun getInstance(): UserApplication = instance
//        var database: LanguageRoomDB? = null

    }

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
//        Paper.init(this)
        instance = this
        startKoin {
            androidLogger()
            androidContext(this@UserApplication)
            modules(
                listOf(
                    PostModule,
                    networkModule,

                )
            )
        }



    }

}