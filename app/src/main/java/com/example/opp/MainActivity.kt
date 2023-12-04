package com.example.opp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.opp.databinding.ActivityMainBinding
import com.example.opp.AppPreferences.AppPreferences

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            if (AppPreferences.isFirstRun(this)) {
                // É a primeira execução, mostra a tela de boas-vindas
                val intent = Intent(this, FirstScreen::class.java)
                startActivity(intent)
                // Após mostrar a tela de boas-vindas, defina a flag para indicar que o aplicativo já foi aberto
                AppPreferences.setFirstRunFlag(this, false)
            } else {
                // Não é a primeira execução, mostra a tela inicial
                val intent = Intent(this, CadScreen::class.java)
                startActivity(intent)
            }
        }, 2000)
    }
}