package com.example.archie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.archieui.Activity_ArchieLocation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goLearn(view: View) {
        val intent = Intent(this, archieinfo::class.java)
        startActivity(intent)
    }

    fun goView(view: View) {
        // maybe direct to camera already?
    }

    fun goLoc(view: View) {
        val intent = Intent(this, Activity_ArchieLocation::class.java)
        startActivity(intent)
    }

    fun goStatus(view: View) {
        val intent = Intent(this, archieStatus::class.java)
        startActivity(intent)
    }
}
