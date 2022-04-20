package com.example.api.domain.interactor

import com.example.api.domain.Entity.UserEntity
import com.example.api.domain.repository.UserRepository
import io.reactivex.Observable


class ApiUc constructor(val userRepository: UserRepository) :
    UseCase<UserEntity,Unit>()  {

    override fun build(param: Unit): Observable<UserEntity> {
        return userRepository.doApi()
    }
}