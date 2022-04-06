package com.app.test.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.app.test.data.MyName
import com.app.test.ui.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private val TAG = LoginActivity::class.java.simpleName
    private val myName : MyName = MyName("demo","123")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        binding.apply {
            binding.myName = myName
            myName?.pass = editTextPassword.text.toString()
            invalidateAll()
        }
        binding.buttonLogin.setOnClickListener {
            Log.e(TAG, "onCreate: " + binding.editTextName.text.toString())
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}