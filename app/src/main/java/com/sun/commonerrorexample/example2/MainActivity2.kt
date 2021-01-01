package com.sun.commonerrorexample.example2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sun.commonerrorexample.R
import com.sun.commonerrorexample.example2.fragment_c.CFragment

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        init()
    }

    private fun init() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.frameContent, CFragment())
            .commit()
    }
}
