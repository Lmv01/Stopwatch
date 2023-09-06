package com.example.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    //declaring a classwide constant in java:
    // public static final double PI = 3.14
    //in kotlin, we use a companion onject 
    companion object{
        //TAG is the defualt ar name for labeling your log statements
        val TAG =  "MainActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: this is a log")


    }
    //to override an existing function, just start typing it
    // can do this for the rest of the lifecycle functions (or any function that exists in the super class)
    override fun onStart(){
        super.onStart()
    }
}