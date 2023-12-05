package com.example.opp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.opp.databinding.ActivityCadScreenBinding
import com.example.opp.AppPreferences.AppPreferences

class CadScreen : AppCompatActivity() {

    private lateinit var binding: ActivityCadScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Após mostrar a tela de boas-vindas, defina a flag para indicar que o aplicativo já foi aberto
        AppPreferences.setFirstRunFlag(this, false)

        // adicionar acao dos botoes
        binding.btnCad.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnLog.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}