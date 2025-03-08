package com.rain.mytestapplication

import android.app.Application
import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import android.content.res.Resources.Theme
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.util.Log
import android.util.SparseArray
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.res.ResourcesCompat.ThemeCompat
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.rain.mytestapplication.tools.ArrayTools
import com.rain.mytestapplication.ui.theme.MyTestApplicationTheme
import com.rain.mytestapplication.viewmodel.HomeViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.supervisorScope
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.resume


class MainActivity : ComponentActivity() {


    lateinit var homeViewModel: HomeViewModel

    companion object {
        var KEY_STRING_ONE = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setTheme(androidx.appcompat.R.style.Base_Theme_AppCompat)
        setContent {
            MyTestApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("${ArrayTools.removeArrayElement()}")
                }
            }
        }
        homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]

        lifecycleScope.launch {

        }

        CoroutineScope(SupervisorJob()).launch {
            testString()

            withContext(Dispatchers.IO){
                val liveData = MutableLiveData<Int>()
                delay(100)
            }
        }

        lifecycleScope.launch(SupervisorJob()+ MyExceptionHandler()) {
            supervisorScope {
                launch {

                }
                launch {

                }
            }
        }

        GlobalScope.launch {
              val job =  async {  }
            job.await()
        }


        homeViewModel.merge(intArrayOf(1,2,3,0,0,0),3, intArrayOf(2,5,6,),3)
        Thread({
            println("")
//          Looper.getMainLooper()
        }).start()


//        ThreadLocal<Looper>()
//        Looper.prepare()



        viewModelStore.keys()

        homeViewModel.testLiveData.observe(this) {

        }

        val homeViewModel1 = homeViewModel
        Log.d("MainActivity", "homeViewModel1 == homeViewModel: ${homeViewModel1 == homeViewModel}")


        Handler().post {

        }

//        isGoogleDNSReachable()

        testSort()
    }


    fun isGoogleDNSReachable(): Boolean {
        return try {
            val process = Runtime.getRuntime().exec("ping -c 1 www.google.com")
            val returnVal = process.waitFor()
            println("canAccessInternet,isReachable1 ${returnVal == 0}")
            return returnVal == 0
//            process.inputStream.bufferedReader().use { reader ->
//                var isReachable = false
//                reader.forEachLine { line ->
//                    if (line.matches(".*1 packets transmitted, 1 received.*".toRegex())) {
//                        isReachable = true
//                        return@forEachLine
//                    }
//                }
//                println("canAccessInternet,isReachable1 $isReachable")
//                isReachable
//            }
        } catch (e: IOException) {
            e.printStackTrace()
            println("canAccessInternet, isReachable 2${e.message}")
            false
        }

    }

    private fun testSort(){
        val names = mutableListOf("122","qwwe","srr","avf","eff","22167","123","087")
        val sortNameDes = names.sortedByDescending { it }
        val sortBy =  names.sortBy { it }
        val reverseName = sortNameDes.reversed()
        print("     testSort: reverseName = $names \n")
        print("     testSort: sortNameDes = $sortNameDes")
    }

    suspend fun forTest(){
        var array: IntArray = intArrayOf(1, 2, 3)
        array.sum()
        val arrayList: ArrayList<String> = ArrayList<String>(8)
//        arrayList.get(0)
        array.size
        array[0]
        array.size.times(1)
        var str = "abababab"
        var str1 = "ab"
        str.indexOf("", 1)
        str.count { it == '0' }
        str.isBlank()
        str.isEmpty()
        str.substring(0, 15)
        str.substring(IntRange(0, 15))
        str.replace('A', 'a', ignoreCase = true)
        str.replace(Regex("[0-9]"), "kotlin")
        str.replaceFirst("A", "a")
        str.replaceBefore("A", "a")
        str.split("", "a")
        str.count { it == 'a' }
        str.startsWith("sv")
        str.reversed()
        str.toInt()
        str.map { it.toInt() }
        val char = str.toCharArray()[0] - '0'
        var charArray: CharArray = str.toCharArray()
        val strArray: List<Char> = str.toCharArray().toList()
        var s = ArrayList<Char>(16)
        s.addAll(strArray)
        for (s in 1..str.toCharArray().size) {
            println("$s")
        }


        Handler().post(Runnable {

        })

        Handler().sendMessage(Message())


        val stringBulder = StringBuilder("abababab")
        stringBulder.reverse()
//        stringBulder.toCharArray()
        stringBulder.substring(1, 3)
//        stringBulder.replace('A','a',ignoreCase = true )
        stringBulder.filter { it == 'c' }



//        Log.d("MainActivity", "strNumber = ${str-=str1}")

//        homeViewModel.apply {
////            homeText.chars()
//        }

        for (i in 0..100 step 2) {
        }

        for (i in 6 downTo 0 step 2) {
        }

        for (i in array.indices) {
        }

        for ((index, value) in array.withIndex()) {
        }


        val chars = str.toCharArray()
        chars[0]

        onRetainNonConfigurationInstance()
        val lastDate = lastNonConfigurationInstance.toString()
        SparseArray<String>().put(0, "12")
        hashMapOf<Int, String>()

    }

    fun HomeViewModel.abd(){
        this.main()
        getResources().getConfiguration().locale
        baseContext.getString(R.string.app_name)
    }


    override fun onRetainCustomNonConfigurationInstance(): String? {
        return "save data"
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    override fun registerActivityLifecycleCallbacks(callback: Application.ActivityLifecycleCallbacks) {
        super.registerActivityLifecycleCallbacks(callback)
    }

    override fun registerReceiver(receiver: BroadcastReceiver?, filter: IntentFilter?): Intent? {
        return super.registerReceiver(receiver, filter)
    }

    @Composable
    fun Greeting(name: String) {


        var text by remember {
            mutableStateOf(homeViewModel.homeText)
        }

        var stateText by remember { mutableStateOf("one") }
        Column {
            Text(
                text = "Hello $name!",
                modifier = Modifier.clickable {
                    stateText = "two"
                    Log.d("MainActivity", "text = $stateText")
                    startActivity(Intent(this@MainActivity,TestActivity::class.java))
                }
            )
            Text(text = stateText)
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        MyTestApplicationTheme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                Greeting("Android")
            }
        }
    }

}


class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null


    fun a(){
        val handler =  Handler(object :Handler.Callback {
            override fun handleMessage(msg: Message): Boolean {
                TODO("Not yet implemented")
            }

        })
        handler.handleMessage(Message())
    }
}

private suspend fun testString() {
    val s = "abc"
    s.firstOrNull()
    s.firstOrNull { it == 'a' }

    val a = s[0]
    val num1: IntArray = intArrayOf(1, 2, 3)

//    withTimeout(5000){
//
//    }

    log(0)
    val job = CoroutineScope(context = Dispatchers.IO).launch(start = CoroutineStart.ATOMIC) {
        log(1)
//        Thread.sleep(100)
        delay(100)

        log(2)
    }

    job.cancel()
    Thread.sleep(100)

    log(3)
//    job.join()
    Thread.sleep(1000)
}

fun test() {
    Thread.sleep(100)
    log(2)
}

fun getMinimumDifference(root: TreeNode?): Int {
    if (root?.left == null || root.right == null) return 10000
    val leftValue: Int = root.`val`?.minus(root.left?.`val` ?: 0) ?: 1000
    val rightValue: Int = root.right?.`val`?.minus(root.`val`) ?: 10000
    val minValue = if (leftValue > rightValue) {
        rightValue
    } else {
        leftValue
    }
    val minLeftValue = getMinimumDifference(root?.left)
    val minRightValue = getMinimumDifference(root?.right)
    if (minValue > minLeftValue) {
        if (minLeftValue > minRightValue) {
            return minRightValue
        } else {
            return minLeftValue
        }
    }
    return minValue
}


@OptIn(InternalCoroutinesApi::class)
suspend fun responseWithSuspend(): String {

    return suspendCancellableCoroutine {

        if (true) {
            it.resume("s")
        }
        it.tryResumeWithException(Throwable(""))
    }

}

fun num() {
    val list = mutableListOf("1", "2", "3", "4", "5", "6", "7", "8", "9")
    val l = list.asSequence()
        .filter { it.toCharArray()[0] < '4' }
        .map { it.toInt() * it.toInt() }
        .toList()
}

fun log(o: Any?) {

    println("[Thread is ${Thread.currentThread().name}] = $o")
}

class  MyExceptionHandler : CoroutineExceptionHandler{

    override val key: CoroutineContext.Key<*>
        get() = CoroutineExceptionHandler
    override fun handleException(context: CoroutineContext, exception: Throwable) {
        TODO("Not yet implemented")
    }

    fun test(s:String):Boolean{
        s.toInt()
        val intArray: IntArray = intArrayOf(0,1)
        val mutList = mutableListOf<Int>()
        mutList.add(0,1)
       var input =  s.toCharArray()
        input[0].isDigit()
        if(input.size == 0){
            return false
        }
        val middle = input.size/2
        for (i in 0..middle){
            if (input[i] != input[input.size-i]){
                return false
            }
        }


//        for ( i in  (input.size)..0){
//
//        }
        if (input[0] !in '0'..'9'){
            return true
        }
        return true
    }

}