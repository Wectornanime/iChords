package com.example.opp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.opp.databinding.ActivitySplahScreenBinding
import com.example.opp.AppPreferences.AppPreferences

class SplahScreen : AppCompatActivity() {

    private lateinit var binding: ActivitySplahScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplahScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //vai esperar 2000 milisegundos pra ir pra proxima tela
        Handler(Looper.getMainLooper()).postDelayed({
            if (AppPreferences.isFirstRun(this)) {
                // É a primeira execução, mostra a tela de boas-vindas
                val intent = Intent(this, FirstScreen::class.java)
                startActivity(intent)
            } else {
                //Não é a primeira vez
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }, 2000)
    }
}