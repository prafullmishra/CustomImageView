package com.example.bindingcustomimageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.bindingcustomimageview.databinding.ActivityMainBinding

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        //the below line gives error
        // "Cannot access class 'CustomImage.RatioImageView'. Check your module classpath for missing or conflicting dependencies"
        binding.customview.setBackgroundColor(resources.getColor(android.R.color.darker_gray))
    }
}
