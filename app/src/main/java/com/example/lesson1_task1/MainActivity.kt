package com.example.lesson1_task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.ref.SoftReference

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var orderQuantity: Int? = null
    var review: String? = null

}