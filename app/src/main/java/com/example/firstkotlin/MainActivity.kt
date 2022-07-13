package com.example.firstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.firstkotlin.databinding.ActivityMain2Binding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMain2Binding by lazy {
        ActivityMain2Binding.inflate(layoutInflater)
    }
    private var result1: Int = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        init()
    }


    fun init(){
        binding.btnPlus.setOnClickListener({
            result1++
           binding.txtResult.setText(result1.toString())
        })
    }




}