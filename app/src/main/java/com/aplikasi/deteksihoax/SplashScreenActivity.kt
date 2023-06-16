package com.aplikasi.deteksihoax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashScreenActivity : AppCompatActivity() {

    private val SplashScreen:Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        android.os.Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, SplashScreen)
    }
}