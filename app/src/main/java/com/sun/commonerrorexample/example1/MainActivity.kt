package com.sun.commonerrorexample.example1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.sun.commonerrorexample.R
import com.sun.commonerrorexample.example1.fragment_a.AFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.frameContent, AFragment())
            .addToBackStack("FragmentA")
            .commit()
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("TAG", "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("TAG", "onRestoreInstanceState")
    }
}
