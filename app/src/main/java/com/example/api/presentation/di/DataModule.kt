package com.ecourier.courier.presentation.di

import com.ecourier.courier.data.datasource.mapper.UserDataMapper
import com.ecourier.courier.presentation.utils.Navigator
import com.example.api.presentation.utils.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
/**
 * Created by Pratiksha on 26/3/21.
 */

val PostModule = module {
    viewModel {UserViewModel(get()) }


    factory { UserDataMapper() }

    single { Navigator }
}