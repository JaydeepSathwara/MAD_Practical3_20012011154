package com.example.practical_3

import android.os.Bundle
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

//        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
//        binding.loginText.setOnClickListener {
//            Intent(this, LoginActivity::class.java).also {startActivity(it)}
////            binding.loginText.movementMethod = LinkMovementMethod.getInstance();
//        }

//        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_reg
//        binding.bottomNavigationView.setOnItemSelectedListener { it ->
//            when (it.itemId) {
//                R.id.bottom_nav_login -> {
//                    Intent(this, LoginActivity::class.java).also { startActivity(it) }
//                }
//            }
//            return@setOnItemSelectedListener true
        }

    private fun setSupportActionBar(toolbar: Toolbar?) {

    }
}

class ActivityRegistrationBinding {

    val root: Int
        get() {
            TODO()
        }
    val loginText: Any
        get() {
            TODO()
        }
    val toolbar: Toolbar?
        get() {
            TODO()
        }
}