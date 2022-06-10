package com.diego.calculadora

import Mundo.div
import Mundo.mult
import Mundo.subt
import Mundo.sum
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // call buttons
        val button_sum = findViewById<Button>(R.id.button_sum_main)
        val button_subt = findViewById<Button>(R.id.button_subt_main)
        val button_mult = findViewById<Button>(R.id.button_mult_main)
        val button_div = findViewById<Button>(R.id.button_div_main)

        // call inputs
        val txt_num1 = findViewById<EditText>(R.id.editText_num1_main).text
        val txt_num2 = findViewById<EditText>(R.id.editText_num2_main).text

        // call outputs
        val result = findViewById<TextView>(R.id.view_result_main)

        // actions or events
        button_sum.setOnClickListener{
            try {
                val num1 = txt_num1.toString().toDouble()
                val num2 = txt_num2.toString().toDouble()
                val r = sum(num1, num2)
                result.text = r.toString()
            }
            catch (e: Exception) {
                Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
            }
        }

        button_subt.setOnClickListener{
            try {
                val num1 = txt_num1.toString().toDouble()
                val num2 = txt_num2.toString().toDouble()
                val r = subt(num1, num2)
                result.text = r.toString()
            }
            catch (e: Exception) {
                Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
            }
        }

        button_mult.setOnClickListener{
            try {
                val num1 = txt_num1.toString().toDouble()
                val num2 = txt_num2.toString().toDouble()
                val r = mult(num1, num2)
                result.text = r.toString()
            }
            catch (e: Exception) {
                Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
            }
        }

        button_div.setOnClickListener{
            try {
                val num1 = txt_num1.toString().toDouble()
                val num2 = txt_num2.toString().toDouble()
                val r = div(num1, num2)
                result.text = r.toString()
            }
            catch (e: Exception) {
                Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
            }
        }
    }
}