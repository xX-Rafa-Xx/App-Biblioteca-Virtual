package com.example.virtualsearch

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class RegistrarseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //llama al metodo para crear
        setContentView(R.layout.activity_registrarse) //seteame este layout como la vista del
                                                       //del activity
        btnregistrarse.setOnClickListener{ //Llama a la función del boton
            val intent = Intent(this, RegistrarseActivity::class.java)
        }
    }
}