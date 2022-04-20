package com.ecourier.courier.data.datasource.mapper


import com.example.api.data.datasource.response.ApiResponse
import com.example.api.domain.Entity.UserEntity
import com.example.api.domain.Entity.UserEntityR
import retrofit2.Response
import java.util.ArrayList

/**
 * Created by Pratiksha on 26/3/21.
 */
class UserDataMapper {
    fun getUserData(mUserDataResponse: Response<ApiResponse>):UserEntity{
        val userDataResponse : ApiResponse? = mUserDataResponse.body()
        val mUserDataEntity = UserEntity()
        val userList=userDataResponse?.data
        val userListE=ArrayList<UserEntityR>()
     for(i in 0..userList?.size!! - 1) {
    val mLanguageData = UserEntityR()
    mLanguageData.id = userList.get(i).id
    mLanguageData.employee_name = userList.get(i).employee_name
    mLanguageData.employee_salary = userList.get(i).employee_salary
    mLanguageData.employee_age = userList.get(i).employee_age


    userListE.add(mLanguageData)
}
        mUserDataEntity.data=userListE
        return mUserDataEntity
    }
    }

