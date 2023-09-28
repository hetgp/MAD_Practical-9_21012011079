package com.example.mad_practical_9_21012011079

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alarmanimaton : AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alarm : ImageView = findViewById(R.id.alarm)
        alarm.setBackgroundResource(R.drawable.alarm_animation_list)
        alarmanimaton = alarm.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if(hasFocus){
            alarmanimaton.start()
        }
        else{
            alarmanimaton.stop()
        }
    }
}