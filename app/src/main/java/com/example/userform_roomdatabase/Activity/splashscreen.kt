package com.example.userform_roomdatabase.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.databinding.DataBindingUtil
import com.example.userform_roomdatabase.MainActivity
import com.example.userform_roomdatabase.R
import com.example.userform_roomdatabase.databinding.ActivitySplashscreenBinding

class splashscreen : AppCompatActivity() {
    private lateinit var binding: ActivitySplashscreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=DataBindingUtil.setContentView(this,R.layout.activity_splashscreen)
        getSupportActionBar()?.hide()




        Handler().postDelayed({
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        },2000)





    }
}