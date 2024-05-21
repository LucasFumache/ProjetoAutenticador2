package com.example.loginlucasfumache

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class Inicio : AppCompatActivity() {

    lateinit var tvUser: TextView
    lateinit var btLogout: Button
    private val autentication by lazy {
        FirebaseAuth.getInstance()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
        tvUser = findViewById(R.id.idmail)
        btLogout = findViewById(R.id.btnInicio)
        btLogout.setOnClickListener { autentication.signOut()
            finish()
        }
        tvUser.text = autentication.currentUser?.email }
}