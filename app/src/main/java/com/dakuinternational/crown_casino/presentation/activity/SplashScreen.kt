package com.dakuinternational.crown_casino.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.dakuinternational.crown_casino.R
import com.kaiguanjs.utils.YQCUtils

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash)

        val timer = object: CountDownTimer(3000, 1000){
            override fun onTick(p0: Long) { }
            override fun onFinish() {
                YQCUtils.splashAction(this@SplashScreen){ _, _ ->
                    startActivity(MainActivity.createIntent(this@SplashScreen))
                    finish()
                }
            }
        }
        timer.start()
    }
}