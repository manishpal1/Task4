package com.example.api.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.api.R
import com.example.api.domain.Entity.UserEntityR
import com.example.api.presentation.utils.ApiAdapter
import kotlinx.android.synthetic.main.activity_main2.*
import android.content.Intent





class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intent = getIntent()
        val myList = intent.getStringExtra("USER_NAME")
//        var bundle :Bundle ?=intent.extras
//
//        val myList = intent.getSerializableExtra("list") as ArrayList<UserEntityR>?

        Toast.makeText(this, myList?.size.toString(), Toast.LENGTH_SHORT).show()
       /* apiListRecyclerView.adapter= ApiAdapter(myList!!)
        apiListRecyclerView.layoutManager=LinearLayoutManager(this)*/
    }
}