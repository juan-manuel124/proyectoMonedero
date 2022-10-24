package com.dayanne.myaplicacin2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ingreso(botoning: View) {


                val intento = Intent(this, MainActivity2::class.java)
                startActivity(intento)


            }

        }


