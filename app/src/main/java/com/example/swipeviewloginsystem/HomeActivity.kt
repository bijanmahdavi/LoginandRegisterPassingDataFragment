package com.example.swipeviewloginsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        init()
    }

    private fun init() {
        supportFragmentManager?.beginTransaction().add(R.id.frame_container, LoginFragment()).commit()
    }


}