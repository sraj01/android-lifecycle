package com.example.androidlyfcyclee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onStart() {
        super.onStart()
        println("debugdubey onnnstartt")
    }

    override fun onResume() {
        super.onResume()
        println(" debugdubey onreeesume")

    }

    override fun onPause() {
        super.onPause()
        println( " debugdubey onpaauuuse")

    }

    override fun onStop() {
        super.onStop()
        println(" debugdubey onstooooppp")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("debugdubey ondestrrroy")
    }
}