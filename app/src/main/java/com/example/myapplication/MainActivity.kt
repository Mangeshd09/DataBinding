package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var manager = supportFragmentManager.beginTransaction()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.company = getCompany()
        binding.submitButton.setOnClickListener {
            displaygreetings()
        }

    }

    private fun getCompany(): Company? {
        return Company()
    }

    private fun displaygreetings() {
        binding.apply {
            greetingTextView.text = "Hello " + nameEditText.text
        }
    }

}
