package com.example.opp

import android.content.Context
class AppPreferences {
    object AppPreferences {
        // nome do arquiivo de preferecias compartilhadas
        private const val PREFS_NAME = "MyAppPreferences"
        // nome da chave correspondente ao uso
        private const val KEY_FIRST_RUN = "firstRun"
        // nome da chave correspondente ao login
        private const val KEY_LOGIN = "isloged"

        //funcao para verificar o primeiro uso
        fun isFirstRun(context: Context): Boolean {
            val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            return prefs.getBoolean(KEY_FIRST_RUN, true)
        }

        //funcao para setar o primeiro uso
        fun setFirstRunFlag(context: Context, value: Boolean) {
            val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            prefs.edit().putBoolean(KEY_FIRST_RUN, value).apply()
        }

        //funcao para verificar o login
        fun isLoged(context: Context): Boolean {
            val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            return  prefs.getBoolean(KEY_LOGIN, true)
        }

        //funcao para setar o login
        fun setIsLoged(context: Context, value: Boolean) {
            val pref = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            pref.edit().putBoolean(KEY_LOGIN, value).apply()
        }

    }

}