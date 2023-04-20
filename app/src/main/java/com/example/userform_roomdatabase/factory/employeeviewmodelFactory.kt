package com.example.userform_roomdatabase.factory

import android.text.Spannable.Factory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.userform_roomdatabase.Reposetory.employeedatabaseRepository
import com.example.userform_roomdatabase.Viewmodel.model.EmployeeroomdatabaseViewmodel

class employeeviewmodelFactory(private val repository: employeedatabaseRepository):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(EmployeeroomdatabaseViewmodel::class.java)){
            return EmployeeroomdatabaseViewmodel(repository) as T
        }
        throw IllegalArgumentException("Unknown class")
    }

}