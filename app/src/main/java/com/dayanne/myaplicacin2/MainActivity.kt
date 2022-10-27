package com.dayanne.myaplicacin2

import android.content.DialogInterface
import android.widget.EditText
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    private var edtUserName: EditText? = null
    private var edtPasswor: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtUserName = findViewById(R.id.edtNombreUsuario)
        edtPasswor = findViewById(R.id.edtPassword)
    }

    fun ingreso(botoning: View) {
        var username:String=edtUserName!!.text.toString()
        var password:String=edtPasswor!!.text.toString()
        if ((username == "juan@gmail.com") && (password == "1234")){
            val botonOk = { dialogoIngreso: DialogInterface, which: Int ->
            val intento = Intent(this, MainActivity2::class.java)
            startActivity(intento)
            }
            val botonCancelar={_:DialogInterface,_:Int ->}
            val dialogoIngreso = AlertDialog.Builder(this)
                .setTitle(getResources().getString(R.string.txt_welcome))
                .setMessage("User: "+edtUserName!!.text.toString())
                .setPositiveButton("Ok", botonOk)
                .setNegativeButton(getResources().getString(R.string.txt_cancel),botonCancelar)
            dialogoIngreso.create()
            dialogoIngreso.show()
        }else{//el mensaje Toast es un mensaje temporal
            /*se crea un dialogo o ventana emergente AlertDialog
            val dialog=AlertDialog.Builder(this).setTitle("Error!")
                .setMessage(getResources().getString(R.string.txt_ErrorInt)).create().show()*/

            Toast.makeText(applicationContext, getResources().getString(R.string.txt_ErrorInt), Toast.LENGTH_LONG).show()
        }
    }

}


