package com.example.practical_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate
import android.widget.Toolbar
import androidx.core.view.WindowCompat
//import com.example.practical_3.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

//        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setSupportActionBar(binding.toolbar)

        Intent(this, LoginActivity::class.java).also {startActivity(intent)}

//        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_login
//        binding.bottomNavigationView.setOnItemSelectedListener{ it ->
//            when(it.itemId){
//                R.id.bottom_nav_reg -> {
//                    Intent(this, RegistrationActivity::class.java).also {startActivity(it)}
//                }
//
//                R.id.bottom_nav_login -> {
//                    Intent(this, LoginActivity::class.java). also {startActivity(it)}
//                }
//            }
//            return@setOnItemSelectedListener true
//        }
    }
}

private fun Any.setOnItemSelectedListener(any: Any) {

}

class ActivityMainBinding {

    val bottomNavigationView: Any
        get() {
            TODO()
        }
    val toolbar: Toolbar?
        get() {
            TODO()
        }
    val root: Int
        get() {
            TODO()
        }
}
