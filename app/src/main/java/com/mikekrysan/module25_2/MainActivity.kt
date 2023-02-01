package com.mikekrysan.module25_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.container, OneFragment()) //создается первый фрагмент
            .addToBackStack(null)
            .commit()
    }

    fun startSecondFragment(imageButton: TextView) {
        supportFragmentManager
            .beginTransaction()
            .addSharedElement(imageButton, "transition_1")
            .addToBackStack(null)
            .replace(R.id.container, TwoFragment())
            .commit()
    }

}