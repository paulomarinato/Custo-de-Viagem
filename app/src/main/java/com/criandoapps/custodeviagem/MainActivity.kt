package com.criandoapps.custodeviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.criandoapps.custodeviagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.butonCalculete.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.buton_calculete) {
            calculate()
        }
    }

    private fun calculate() {
        Toast.makeText(this, "Fui Clicado", Toast.LENGTH_SHORT).show()
    }
}