package com.example.lesson1_task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var orderQuantity: Int? = null
    var review: String? = null

}

fun mail() {
    print("Это решение Урока 1 задача 1")
}