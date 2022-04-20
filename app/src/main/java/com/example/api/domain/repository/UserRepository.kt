package com.example.api.domain.repository

import com.example.api.domain.Entity.UserEntity
import java.util.*
import io.reactivex.Observable

interface UserRepository {

    fun doApi():Observable<UserEntity>
}