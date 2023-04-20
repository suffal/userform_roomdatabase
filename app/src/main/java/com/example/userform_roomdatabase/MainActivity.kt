package com.example.userform_roomdatabase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.userform_roomdatabase.Activity.signupActivity
import com.example.userform_roomdatabase.Activity.userForm_Activity
import com.example.userform_roomdatabase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        getSupportActionBar()?.hide()



        binding.btnLogin.setOnClickListener(this)
        binding.btnSkip.setOnClickListener(this)
        binding.dontHaveAAccount.setOnClickListener(this)


    }

    override fun onClick(view: View?) {

        when (view?.id) {
            R.id.btn_skip -> {


                val intent = Intent(this, userForm_Activity::class.java)

                startActivity(intent)
            }

            R.id.dont_have_a_account -> {
                val intent = Intent(this, signupActivity::class.java)
                startActivity(intent)
            }

        }
    }
}