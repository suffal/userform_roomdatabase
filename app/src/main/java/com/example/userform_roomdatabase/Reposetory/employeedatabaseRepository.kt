package com.example.userform_roomdatabase.Reposetory

import com.example.userform_roomdatabase.Roomdatabase.Employee
import com.example.userform_roomdatabase.Roomdatabase.EmployeeDao

class employeedatabaseRepository(private val employeeDao: EmployeeDao) {

    suspend fun insertEmployee(employee: Employee){
        employeeDao.insertEmployee(employee)
    }
}