package com.mydomain.textwatcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var editTextName: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var loginButton: Button

    private val textWatcher = object: TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            //T ODO("Not yet implemented")
        }

        override fun onTextChanged(s: CharSequence?, p1: Int, p2: Int, p3: Int) {
            loginButton.isEnabled =
                !editTextName.text.toString().trim().isEmpty()
                && !editTextPassword.text.toString().trim().isEmpty()
        }

        override fun afterTextChanged(p0: Editable?) {
            //T ODO("Not yet implemented")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.editTextName)
        editTextPassword = findViewById(R.id.editTextPassword)
        loginButton = findViewById(R.id.login_button)

        editTextName.addTextChangedListener(textWatcher)
        editTextPassword.addTextChangedListener(textWatcher)
    }
}