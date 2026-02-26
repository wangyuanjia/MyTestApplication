package com.rain.mytestapplication

import com.rain.mytestapplication.tools.ArrayTools
import com.rain.mytestapplication.tools.ArrayTools.removeArrayElement
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

@RunWith(RobolectricTestRunner::class)
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        removeArrayElement()
//        assertEquals(4, 2 + 2)

    }
}