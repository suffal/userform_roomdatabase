package com.example.userform_roomdatabase.Roomdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Employee(

@PrimaryKey var SrNo:Int,
@ColumnInfo("firstName")var Fname:String,
@ColumnInfo("LastName")var Lname:String,
@ColumnInfo("MobileNumber")var phone:String


)
