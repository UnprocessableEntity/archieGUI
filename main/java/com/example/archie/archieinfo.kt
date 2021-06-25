package com.example.archie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class archieinfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_archieinfo)
    }

    fun goView(view: View) {
        // maybe direct to camera already?
    }

    fun goLoc(view: View) {
        // uses google maps?
    }

    fun goStatus(view: View) {
        val intent = Intent(this, archieStatus::class.java)
        startActivity(intent)
    }

}