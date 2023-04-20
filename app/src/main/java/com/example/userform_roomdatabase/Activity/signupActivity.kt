package com.example.userform_roomdatabase.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider

import com.example.userform_roomdatabase.MainActivity
import com.example.userform_roomdatabase.R
import com.example.userform_roomdatabase.Reposetory.employeedatabaseRepository
import com.example.userform_roomdatabase.Roomdatabase.EmployeeDatabase
import com.example.userform_roomdatabase.Viewmodel.model.EmployeeroomdatabaseViewmodel

import com.example.userform_roomdatabase.databinding.ActivitySignupBinding
import com.example.userform_roomdatabase.factory.employeeviewmodelFactory

class signupActivity : AppCompatActivity(), View.OnClickListener,
    AdapterView.OnItemSelectedListener {
    private lateinit var binding: ActivitySignupBinding
    lateinit var factory: employeeviewmodelFactory
    lateinit var viewmodel: EmployeeroomdatabaseViewmodel


    var usertype: String = " "
    val Item = arrayOf("Guest", "HR", "Cunsultant", "Faculty", "Admin")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_signup)
        getSupportActionBar()?.hide()

        factory=employeeviewmodelFactory(employeedatabaseRepository(EmployeeDatabase.getInstance(this).EmployeeDao()))
        viewmodel=ViewModelProvider(this,factory)[EmployeeroomdatabaseViewmodel::class.java]









        val ItemAdapter =
            ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, Item)
        binding.spinner.adapter = ItemAdapter

        binding.spinner.onItemSelectedListener =
            this  // to use click listener on the spinner view to use Itemselectedlistener

        binding.AlreadyIHaveAAccount.setOnClickListener(this)
        binding.btnSignupSignupactivity.setOnClickListener(this)

    }


    override fun onClick(view: View?) {

        when (view?.id) {
            R.id.Already_I_have_a_account -> {

                val intent = Intent(this, MainActivity::class.java)

                startActivity(intent)
            }

           R.id.btn_signup_signupactivity->{
                 if (binding.SFname.editableText.isEmpty()&&binding.SLname.editableText.isEmpty()&&binding.signupPhoneno1.editableText.isEmpty()){

                     Toast.makeText(this, "please fill required information", Toast.LENGTH_SHORT).show()
                 }else if(binding.SFname.editableText.isEmpty()){
                     Toast.makeText(this, "please fill first name", Toast.LENGTH_SHORT).show()
                 }
               else if (binding.SLname.editableText.isEmpty()){
                     Toast.makeText(this, "please fill last name", Toast.LENGTH_SHORT).show()
                 }
               else if (binding.signupPhoneno1.editableText.isEmpty()){
                     Toast.makeText(this, "please fill required phone number", Toast.LENGTH_SHORT).show()
                 }
               else if (binding.signupPhoneno1.editableText.length!=10){
                   binding.signupPhoneno1.setError("Fill valid number" )
                 }
               else {
                     val intent = Intent(this, userForm_Activity::class.java)

                     startActivity(intent)
                 }
           }
        }
    }

    override fun onItemSelected(adapter: AdapterView<*>?, view: View?, position: Int, row: Long) {
        val data = adapter?.getItemAtPosition(position)
        Toast.makeText(this, "You are selected $data", Toast.LENGTH_SHORT).show()
        usertype = data.toString()

    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

}