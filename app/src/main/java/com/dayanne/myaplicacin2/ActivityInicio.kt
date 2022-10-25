package com.dayanne.myaplicacin2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.DialogInterface
import android.content.Intent
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class ActivityInicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
    }
    fun mtdRegistro(botonRegistro: View) {
        val intento = Intent(this, RegistrarActivity::class.java)
        startActivity(intento)
    }
    fun mtdLogIn(botonInicio: View) {
        val intento = Intent(this, MainActivity::class.java)
        startActivity(intento)
    }
}