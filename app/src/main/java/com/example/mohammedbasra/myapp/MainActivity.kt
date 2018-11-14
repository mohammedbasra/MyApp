package com.example.mohammedbasra.myapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun getAge(view : View){
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val birthYearString = ageInput.text.toString()
        if(birthYearString == ""){
            val toast = Toast.makeText(getApplicationContext(),"Please enter something in the box",Toast.LENGTH_SHORT)
            //toast.setMargin(50f,50f)
            toast.show()
        }
        else {
            val birthYear = birthYearString.toInt()
            val age = currentYear - birthYear
            ageOutput.text = "Your age : $age"
        }
    }
}