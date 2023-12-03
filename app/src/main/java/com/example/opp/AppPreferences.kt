package com.example.opp

import android.content.Context
class AppPreferences {
    object AppPreferences {
        private const val PREFS_NAME = "MyAppPreferences"
        private const val KEY_FIRST_RUN = "firstRun"

        fun isFirstRun(context: Context): Boolean {
            val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            return prefs.getBoolean(KEY_FIRST_RUN, true)
        }

        fun setFirstRunFlag(context: Context, value: Boolean) {
            val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            prefs.edit().putBoolean(KEY_FIRST_RUN, value).apply()
        }
    }

}