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
import com.rain.mytestapplication.num
import kotlinx.coroutines.FlowPreview

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.combineLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.sample
import kotlinx.coroutines.flow.shareIn
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch


class HomeViewModel : ViewModel() {

    companion object {
        var KEY_STRING_ONE = 0
    }

    val mutableState = MutableStateFlow(value = -1)

    val mutableSharedFlow = MutableSharedFlow<Int>()

    val liveData = MutableLiveData<Int>()

    val homeText: Int? = null

    val map = HashMap<String,String>()

    var testLiveData = MutableLiveData<String>()

//    var d = MutableStateFlow()

//    var cleanLiveData

    fun main(): IntArray {
        viewModelScope.launch {
            mutableState.emit(1)
            testLiveData.value = "aa"
            testLiveData.postValue("")
        }

        val v = (homeText ?: 0) + 1

        var sum = intArrayOf(0, 1)
//        val intArray = IntArray(8)
//        intArray.set(0,1)
        return sum
    }


    @OptIn(FlowPreview::class)
    suspend fun dealString() {

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
        val stateFlow = MutableStateFlow(String)
        stateFlow.sample(500).collectLatest {

        }

//        flow.shareIn().stateIn()
        arrayListOf("1","2","3").forEach {
            sharedFlow.tryEmit(it)
        }

        viewModelScope.launch {
            sharedFlow.shareIn(this, SharingStarted.Lazily,1)
            val flow = flow<Int> {

            }

//            sharedFlow.collect{
//                Log.d(this.javaClass.name,it)
//            }
            sharedFlow.sample(500).collectLatest{

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


    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        if(n==0) return

        var l = m-1
        var r = n-1

        for(i in (m+n-1) downTo 0){
            if(r<0 || (l>=0 && nums1[l]>nums2[r])){
                nums1[i] = nums1[l--]
            }else{
                nums1[i] = nums2[r--]
            }
            println("nums1[i]"+nums1[i])
        }

        for(i in (nums1.size -1) downTo 1){
            if(nums1[i]==nums1[i-1]){
                nums1[i] = -1
            }
        }
    }
}