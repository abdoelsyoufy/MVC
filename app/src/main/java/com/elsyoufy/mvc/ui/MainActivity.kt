package com.elsyoufy.mvc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elsyoufy.mvc.R
import com.elsyoufy.mvc.controller.MainActivityController
import com.elsyoufy.mvc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val controller by lazy {
        MainActivityController()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.mainBtnUserName.setOnClickListener {
            if (controller.userName()!= null) binding.mainTvUsername.text = controller.userName()
            else binding.mainTvUsername.text = "Not found UserName"
        }
    }
}