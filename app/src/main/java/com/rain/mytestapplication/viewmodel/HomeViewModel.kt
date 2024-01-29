package com.rain.mytestapplication.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.shareIn
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch


class HomeViewModel  constructor(s:String) : ViewModel() {

    companion object {
        var KEY_STRING_ONE = 0
    }


    val homeText: Int? = null

    var testLiveData = MutableLiveData<String>()

//    var d = MutableStateFlow()

//    var cleanLiveData

    fun main(): IntArray {
        viewModelScope.launch {
            testLiveData.value = "aa"
            testLiveData.postValue("")
        }

        val v = (homeText ?: 0) + 1

        var sum = intArrayOf(0, 1)
//        val intArray = IntArray(8)
//        intArray.set(0,1)
        return sum
    }


    fun dealString() {

        var stringBuilder = StringBuilder("")

        stringBuilder.append("a")
        stringBuilder.delete(stringBuilder.length - 1, stringBuilder.length - 1)
        var arrayList = arrayListOf<String>()
        arrayList.size
        arrayList.plus("a")
        arrayList.remove("b")
        arrayList.removeAt(0)
        var max = maxOf(1, 2)
        stringBuilder.contains("a")
        stringBuilder[0].toString()
        var set = HashSet<String>()

        for (i in arrayList.indices) {
            if (arrayList.contains("")) {
                arrayList.remove("")
            }
        }

        Character.isLetterOrDigit('c')
        Character.toLowerCase('a')
        stringBuilder.append(Character.toLowerCase('a'))
        stringBuilder.append(stringBuilder)
        stringBuilder.substring(1, 2)
        var s = "abc"
        s.equals("c")
        val reverseB = stringBuilder.reverse()
        arrayList.forEach {

        }


        var sharedFlow = MutableSharedFlow<String>()

//        flow.shareIn().stateIn()
        arrayListOf("1","2","3").forEach {
            sharedFlow.tryEmit(it)
        }

        viewModelScope.launch {
            sharedFlow.shareIn(this, SharingStarted.Lazily,1)
            val flow = flow<Int> {

            }

            sharedFlow.collect{
                Log.d(this.javaClass.name,it)
            }
        }



        var a: Int? = null
        var b = a ?: 0
        var intArray = IntArray(10)
//        val temp = arrayListOf<Int>()
        val temp = ArrayList<Int>()
        temp.add(1)
        temp.add(2)
        temp.size
        for(i in temp.indices){

        }
    }


}