package com.example.archie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class archieStatus : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_archie_status)
    }

    fun goWeather(view: View) {
        val intent = Intent(this, ArchieWeather::class.java)
        startActivity(intent)
    }

}