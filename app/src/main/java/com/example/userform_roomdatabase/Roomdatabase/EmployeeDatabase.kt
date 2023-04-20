package com.example.userform_roomdatabase.Roomdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Employee::class], version = 1)
abstract class EmployeeDatabase():RoomDatabase() {
    abstract fun EmployeeDao():EmployeeDao // this fun return EmployeeDao




   companion object{

       @Volatile

       // creat insatnce of Employeedatabase class
       var INSATNCE:EmployeeDatabase?= null


       fun getInstance( context: Context ):EmployeeDatabase {
           var instance=INSATNCE
           if (INSATNCE == null) {

               synchronized(this){
                   instance= Room.databaseBuilder(context, EmployeeDatabase::class.java, "employee").build()
                   INSATNCE=instance

               }
           }
           return INSATNCE!!

       }
   }


}