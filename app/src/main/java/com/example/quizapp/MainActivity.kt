package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.java.setOnClickListener{
            binding.java.setBackgroundResource(R.drawable.round_back_white_stroke)

            binding.android.setBackgroundResource(R.drawable.wound_back_white)
            binding.html.setBackgroundResource(R.drawable.wound_back_white)
            binding.php.setBackgroundResource(R.drawable.wound_back_white)
        }
        binding.html.setOnClickListener{
            binding.html.setBackgroundResource(R.drawable.round_back_white_stroke)

            binding.android.setBackgroundResource(R.drawable.wound_back_white)
            binding.java.setBackgroundResource(R.drawable.wound_back_white)
            binding.php.setBackgroundResource(R.drawable.wound_back_white)
        }
        binding.php.setOnClickListener{
            binding.php.setBackgroundResource(R.drawable.round_back_white_stroke)

            binding.android.setBackgroundResource(R.drawable.wound_back_white)
            binding.html.setBackgroundResource(R.drawable.wound_back_white)
            binding.java.setBackgroundResource(R.drawable.wound_back_white)
        }
        binding.android.setOnClickListener{
            binding.android.setBackgroundResource(R.drawable.round_back_white_stroke)

            binding.java.setBackgroundResource(R.drawable.wound_back_white)
            binding.html.setBackgroundResource(R.drawable.wound_back_white)
            binding.php.setBackgroundResource(R.drawable.wound_back_white)
        }



    }
}