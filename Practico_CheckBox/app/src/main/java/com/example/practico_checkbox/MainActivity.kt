package com.example.practico_checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*; // conexion con xml

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener{
            /* Evento del btnCalcular  */

            val num1: Double = txtNum1.text.toString().toDouble()
            val num2: Double = txtNum2.text.toString().toDouble()

            if(cBoxSuma.isChecked && cBoxResta.isChecked){
                txtViewResultado.text = "SUMA = ${operacion("suma",num1,num2)} | RESTA = ${operacion("resta",num1,num2)}"
            }else if(cBoxSuma.isChecked){
                txtViewResultado.text = "SUMA = ${operacion("suma",num1,num2)}"
            }else if(cBoxResta.isChecked){
                txtViewResultado.text = "RESTA = ${operacion("resta",num1,num2)}"
            }else{
                txtViewResultado.text = "Error: Debe elegir una operacion a realizar."
            }
        }
    }

    fun operacion(tipo: String, num1: Double, num2: Double): Double{
        when(tipo){
            "suma" -> return (num1 + num2)
            else -> return (num1 - num2)
        }
    }
}

