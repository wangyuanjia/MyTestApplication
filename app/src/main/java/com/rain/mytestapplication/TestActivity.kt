package com.rain.mytestapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.compose.ui.graphics.Color
import androidx.core.content.ContextCompat

class TestActivity : ComponentActivity() {

    var tv1 : TextView?=null
    var tv2 : TextView?=null
    var tv3 : TextView?=null
    var tv4 : TextView?=null
    var tv5 : TextView?=null
    var et : EditText?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test_layout)
        et = findViewById<EditText>(R.id.et)
        tv1 = findViewById<TextView>(R.id.tv_1)
        tv2 = findViewById<TextView>(R.id.tv_2)
        tv3 = findViewById<TextView>(R.id.tv_3)
        tv4 = findViewById<TextView>(R.id.tv_4)
        tv5 = findViewById<TextView>(R.id.tv_5)

        et?.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                if(s?.length == 5){
                    inputWord(s.toString())
                }
            }

        })


    }

    val secretWord = "qwert"
    var resultWord = hashMapOf<Int, String>()
    var tempWold = mutableListOf<Int>()
    var tempWold1 = mutableListOf<Int>()
    fun inputWord(input: String) {
        println("input = ${input}")
        resetColor()
        resultWord.clear()
        tempWold.clear()
        tempWold1.clear()

        for (i in input.indices) {
            println("input = ${input[i]}, secretWord = ${secretWord[i]}")
            if (input[i] == secretWord[i]) {
                resultWord[i] = secretWord[i].toString()
                tempWold.add(i)
            } else {
                if (secretWord.contains(input[i])) {
                    val index = secretWord.indexOf(input[i])
                    resultWord[index] = secretWord[index].toString()
                    tempWold1.add(index)
                }
            }
        }

        println("tempWold = ${tempWold}, tempWold1 = ${tempWold1}")

        tempWold.forEach{
            if(it == 0){
                tv1?.text = resultWord[it]
                tv1?.setTextColor(ContextCompat.getColor(this,R.color.purple_200))
            }else if(it == 1){
                tv2?.text = resultWord[it]
                tv2?.setTextColor(ContextCompat.getColor(this,R.color.purple_200))
            }else if(it == 2){
                tv3?.text = resultWord[it]
                tv3?.setTextColor(ContextCompat.getColor(this,R.color.purple_200))
            }else if(it == 3){
                tv4?.text = resultWord[it]
                tv4?.setTextColor(ContextCompat.getColor(this,R.color.purple_200))
            }else if(it == 4){
                tv5?.text = resultWord[it]
                tv5?.setTextColor(ContextCompat.getColor(this,R.color.purple_200))
            }
        }

        tempWold1.forEach{
            if(it == 0){
                tv1?.text = resultWord[it]
                tv1?.setTextColor(ContextCompat.getColor(this,R.color.teal_200))
            }else if(it == 1){
                tv2?.text = resultWord[it]
                tv2?.setTextColor(ContextCompat.getColor(this,R.color.teal_200))
            }else if(it == 2){
                tv3?.text = resultWord[it]
                tv3?.setTextColor(ContextCompat.getColor(this,R.color.teal_200))
            }else if(it == 3){
                tv4?.text = resultWord[it]
                tv4?.setTextColor(ContextCompat.getColor(this,R.color.teal_200))
            }else if(it == 4){
                tv5?.text = resultWord[it]
                tv5?.setTextColor(ContextCompat.getColor(this,R.color.teal_200))
            }
        }

    }

    private fun resetColor(){
//        tv1?.setTextColor(0x222222)
//        tv2?.setTextColor(0x222222)
//        tv3?.setTextColor(0x222222)
//        tv4?.setTextColor(0x222222)
//        tv4?.setTextColor(0x222222)
    }

}