package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var count = 0

        btn.setOnClickListener(){
            performAction()
        }
    }

    fun performAction() {
        txt.text = "$count"
        count = increase(count)
        txt.text = "$count"
    }

    fun increase(count: Int): Int {
        val newCount: Int
        newCount = count + 1
        return newCount
    }
}
