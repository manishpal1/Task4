package com.example.api.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.ecourier.courier.presentation.enums.Status
import com.example.api.R
import com.example.api.domain.Entity.UserEntityR
import com.example.api.presentation.utils.UserViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
//    lateinit var button:Button
val userViewModel: UserViewModel by viewModel()
    var mlist : ArrayList<UserEntityR>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userViewModel.getUserData()
        ObserveUserResponse()
//        button=findViewById(R.id.button)
        buttonFetch.setOnClickListener {
//Log.d("success",""+mlist)
            var intent=Intent(this,MainActivity2::class.java)
            intent.putExtra("list",mlist)
            startActivity(intent)



        }
    }

  /*  fun fetchApi(view: View) {
      *//* var intent=Intent(this,MainActivity2::class.java)
        startActivity(intent)*//*
        userViewModel.getUserData()
        ObserveUserResponse()


    }*/
fun ObserveUserResponse(){
    userViewModel.getUserDataResponse().observe(this, Observer {
        response ->when(response.status){
            Status.SUCCESS ->{
                Log.d("success", "" + response.status)
                Log.d("success",""+response.userListEntity?.data?.get(1)?.employee_name)
                mlist=response.userListEntity?.data
                Toast.makeText(this, mlist?.size.toString(), Toast.LENGTH_SHORT).show()
                /*var intent=Intent(this,MainActivity2::class.java)
                intent.putExtra("list",mlist)
                startActivity(intent)*/
            }
            Status.ERROR -> {
            Log.d("error", response.error.toString())
        }
        }
    })}
}