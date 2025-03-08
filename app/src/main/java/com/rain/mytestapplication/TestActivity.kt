package com.rain.mytestapplication

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.text.Editable
import android.text.TextWatcher
import android.view.DragAndDropPermissions
import android.view.DragEvent
import android.webkit.WebView
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.graphics.Color
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

class TestActivity : AppCompatActivity() {

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
        isGoogle()

    }


    private fun isGoogle(){

//        GlobalScope.launch {
//            println("canAccessInternet = ${ async { canAccessInternet() }.await()}")
//        }

        GlobalScope.launch {
            println("canAccessInternet = ${ async { checkGstaticAccessSync() }.await()}")
        }
    }



    fun checkGstaticAccessSync() {
        println("canAccessInternet,responseCode = -------------")
        // 创建 OkHttpClient
        val client = OkHttpClient()

        // 创建 Request 对象
        val request = Request.Builder()
            .url("https://www.gstatic.com/robots.txt")  // 请求 www.gstatic.com 的资源
            .build()

        try {
            // 同步请求，execute 会阻塞当前线程
            val response: Response = client.newCall(request).execute()

            // 检查响应是否成功
            if (response.isSuccessful) {
                println("Successfully accessed gstatic.com")
                // 读取响应数据
                val responseData = response.body?.string()
                println("Response Data: $responseData")
                println("canAccessInternet,responseCode = true")
            } else {
                println("Failed to access gstatic.com: Response code ${response.code}")
                println("canAccessInternet,responseCode = false")
            }

            // 关闭响应
            response.close()

        } catch (e: IOException) {
            // 处理请求失败的异常
            println("Error accessing gstatic.com: ${e.message}")
        }
    }



    suspend  fun canAccessInternet(): Boolean {
        return try {
            println("canAccessInternet,responseCode = -------------")
            withContext(Dispatchers.IO) {
//                val url = URL("https://blog.geekzhao.me/http_generate_204.html")
                val url = URL("https://www.gstatic.com/robots.txt")
//                val url = URL("https://www.google.com")
//                val url = URL("google.com")
                val connection = url.openConnection() as HttpURLConnection
                connection.requestMethod = "GET"
                connection.connectTimeout = 500
                connection.connect()
                // 判断响应码是否为 200，表示请求成功
                println("canAccessInternet,responseCode = ${connection.responseCode}")
                connection.responseCode == 200
            }
        } catch (e: Exception) {
            println("canAccessInternet,responseCode connect error e = ${e.message}")
            false
        }
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

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(newBase)//多语言
        WebView(this)
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    override fun requestDragAndDropPermissions(event: DragEvent?): DragAndDropPermissions {
        return super.requestDragAndDropPermissions(event)
    }

    override fun shouldShowRequestPermissionRationale(permission: String): Boolean {
        return super.shouldShowRequestPermissionRationale(permission)
    }
}