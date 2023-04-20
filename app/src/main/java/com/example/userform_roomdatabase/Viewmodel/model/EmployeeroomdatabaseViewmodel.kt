package com.example.userform_roomdatabase.Viewmodel.model

import androidx.lifecycle.ViewModel
import com.example.userform_roomdatabase.Reposetory.employeedatabaseRepository
import com.example.userform_roomdatabase.Roomdatabase.Employee

class EmployeeroomdatabaseViewmodel(private val repository: employeedatabaseRepository):ViewModel() {

    suspend fun insertEmployee(employee: Employee){
        repository.insertEmployee(employee)

    }
}