package com.example.userform_roomdatabase.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.userform_roomdatabase.R
import com.example.userform_roomdatabase.databinding.ActivityUserFormBinding

class userForm_Activity : AppCompatActivity() {



    private lateinit var binding: ActivityUserFormBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


       binding=DataBindingUtil.setContentView(this,R.layout.activity_user_form)

















    }
}