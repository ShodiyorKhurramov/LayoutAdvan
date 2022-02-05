package com.example.layoutadvanced.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.layoutadvanced.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        val b_task5=findViewById<Button>(R.id.b_task5)
        val b_task2=findViewById<Button>(R.id.b_task2)
        val b_task6=findViewById<Button>(R.id.b_task6)
        b_task2.setOnClickListener{
            openTask2Activitty()
        }
        b_task5.setOnClickListener{
            openTask5Activitty()
        }
        b_task6.setOnClickListener{
            openTask6Activitty()
        }
    }

    fun openTask2Activitty(){
        val intent= Intent(this, Task2_3_4Activity::class.java)
        startActivity(intent)
    }
   fun openTask5Activitty(){
        val intent=Intent(this, Task5Activity::class.java)
       startActivity(intent)
    }
    fun openTask6Activitty(){
        val intent=Intent(this, Task6Activity::class.java)
        startActivity(intent)
    }



}