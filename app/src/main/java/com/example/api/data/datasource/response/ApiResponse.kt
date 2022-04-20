package com.example.api.data.datasource.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ApiResponse: Serializable {
    @SerializedName("status")
    @Expose
    var status:String?=null
    @SerializedName("data")
    @Expose
    var data:ArrayList<ApiResponseR>? = null

}
class ApiResponseR{
    @SerializedName("id")
    @Expose
    var id:Int?=null
    @SerializedName("employee_name")
    @Expose
    var employee_name:String?=null
    @SerializedName("employee_salary")
    @Expose
    var employee_salary:Int?=null
    @SerializedName("employee_age")
    @Expose
    var employee_age:Int?=null

}
/*class ApiResponse:Serializable {

    var usrList:ArrayList<ApiResponseR>? = null
}*/
/*
class Data {
    @SerializedName("nameValuePairs")
    @Expose
    var nameValuePairs: NameValuePairs__2? = null
}
class ApiResponseR {
    @SerializedName("id")
    @Expose
    var id: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("avatar")
    @Expose
    var avatar: String? = null

    @SerializedName("email")
    @Expose
    var email: String? = null

    @SerializedName("nameValuePairs")
    @Expose
    var nameValuePairs: NameValuePairs? = null

    @SerializedName("mobileNumber")
    @Expose
    var mobileNumber: String? = null

    @SerializedName("password")
    @Expose
    var password: String? = null
}
class NameValuePairs {
    @SerializedName("to")
    @Expose
    var to: String? = null

    @SerializedName("notification")
    @Expose
    var notification: Notification? = null

    @SerializedName("data")
    @Expose
    var data: Data? = null
}
class NameValuePairs__1 {
    @SerializedName("body")
    @Expose
    var body: String? = null

    @SerializedName("title")
    @Expose
    var title: String? = null

    @SerializedName("sound")
    @Expose
    var sound: String? = null

    @SerializedName("icon")
    @Expose
    var icon: String? = null

    @SerializedName("tag")
    @Expose
    var tag: String? = null

    @SerializedName("priority")
    @Expose
    var priority: String? = null
}
class NameValuePairs__2 {
    @SerializedName("text")
    @Expose
    var text: String? = null

    @SerializedName("title")
    @Expose
    var title: String? = null
}
class Notification {
    @SerializedName("nameValuePairs")
    @Expose
    var nameValuePairs: NameValuePairs__1? = null
}*/
