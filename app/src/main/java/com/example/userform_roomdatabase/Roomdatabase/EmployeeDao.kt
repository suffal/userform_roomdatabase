package com.example.userform_roomdatabase.Roomdatabase

import androidx.room.Dao
import androidx.room.Insert
@Dao
interface EmployeeDao {

    @Insert
    suspend fun insertEmployee(vararg employee: Employee ){

    }
}