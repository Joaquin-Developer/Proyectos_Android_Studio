package com.example.app1

/* Clase Principal de mi aplicacion android */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// Para poder acceder a los objetos visuales definidos en
// el archivo activity_main.xml (los dos EditText, el Button y el TextView)
// debemos hacer el siguiente import:
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAceptar.setOnClickListener{  // boton del xml btnAceptar
            //todo evento asociado al btnAceptar

            val nombre: String = eTxtNombre.text.toString()    // obtenemos el valor del campo eTxtNombre, lo guardamos en una val

            val mensaje: String = "Bienvend@ a Android, $nombre"

            txtViewMiNombre.text = mensaje
            // al textView le asigno el valor del string mensaje
        } //todo fin del evento setOnClickListener()

    }
}

