package com.example.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    private fun init(){
        generateButton.setOnClickListener {
            val number = randomNumber()
            numberTextView.text = number.toString()
            if (number%5==0 && number>0){
                yesNO.text="yes"

            }else{
               yesNO.text="No"
            }

        }


    }
    private fun randomNumber():Int {
      val number:Int = (-100..100).random()
        return number





    }


}