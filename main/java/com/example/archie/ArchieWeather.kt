package com.example.archie

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import org.json.JSONObject
import java.net.URL

class ArchieWeather: AppCompatActivity() {

    val CITY: String = "Baguio"
    val API: String = "0b38129d5d86d4e059fe2fdb66ab1560" //API Key from OpenWeather. needs internet to get current weather

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_archie_weather)
        weatherTask().execute()
    }
    inner class weatherTask() : AsyncTask<String, Void, String>(){

        override fun doInBackground(vararg p0: String?): String? {
            var response:String?
            try {
                response = URL("https://api.openweathermap.org/data/2.5/weather?q=$CITY&units=metric&appid=$API") //use this to access array of values
                        .readText(Charsets.UTF_8)
            }
            catch (e: Exception){
                response = null
            }
            return response
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            try{
                val jsonObj = JSONObject(result)
                val main = jsonObj.getJSONObject("main")
                val temp = main.getString("temp")+"°C"
                val tmp = main.getInt("temp")
                if(tmp<20){
                    findViewById<TextView>(R.id.tempTxtId).text = "It's cold today. Better grab some blankets"
                    findViewById<ImageView>(R.id.tempImgId).setImageResource(R.drawable.cloudy)
                }

                if (tmp>=20 && tmp<30){
                    findViewById<TextView>(R.id.tempTxtId).text = "It's sunny outside!"
                    findViewById<ImageView>(R.id.tempImgId).setImageResource(R.drawable.sun)
                }

                findViewById<TextView>(R.id.tempValueId).text = temp

            }catch (e: Exception){
                findViewById<TextView>(R.id.tempValueId).text = "Cannot retrieve"
            }
        }

    }
}
