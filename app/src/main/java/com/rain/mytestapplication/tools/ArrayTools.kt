package com.rain.mytestapplication.tools

import android.util.Log
import com.rain.mytestapplication.log

object ArrayTools {


    fun removeArrayElement(): String {
        val originalData: String = "98.83 \n" +
                "261.79 \n" +
                "0.62 \n" +
                "15.06 \n" +
                "151.68 \n" +
                "164.67 \n" +
                "322.12 \n" +
                "24.62 \n" +
                "7.64 \n" +
                "789.49 \n" +
                "575.22 \n" +
                "64.08 \n" +
                "0.08 \n" +
                "677.44 \n" +
                "0.08 \n" +
                "193.27 \n" +
                "1992.56 \n" +
                "494.69 \n" +
                "0.08 \n" +
                "13.32 \n" +
                "0.08 \n" +
                "99.01 \n" +
                "2.47 \n" +
                "384.45 \n" +
                "3117.70 \n" +
                "339.62 \n" +
                "460.18 \n" +
                "1265.49 \n" +
                "69.96 \n" +
                "36.23 \n" +
                "14.83 \n" +
                "243.00 \n" +
                "2.29 \n" +
                "226.42 \n" +
                "5.64 \n" +
                "4600.04 \n" +
                "0.08 \n" +
                "0.13 \n" +
                "28.07 \n" +
                "91.90 \n" +
                "51.77 \n" +
                "945.89 \n" +
                "4128.44 \n" +
                "0.08 \n" +
                "644.25 \n" +
                "1123.85 \n" +
                "41415.92 \n" +
                "0.08 \n" +
                "125.40 \n" +
                "0.08 \n" +
                "33.36 \n" +
                "293.25 \n" +
                "37.26 \n" +
                "602.60 \n" +
                "27.50 \n" +
                "1127.89 \n" +
                "0.08 \n" +
                "1150.44 \n" +
                "1438.05 \n" +
                "161.06 \n" +
                "2122.89 \n" +
                "195.58 \n" +
                "0.08 \n" +
                "381.94 \n" +
                "603.98 \n" +
                "161.06 \n" +
                "0.08 \n" +
                "1944.25 \n" +
                "966.37 \n" +
                "0.06 \n" +
                "5073.45 \n" +
                "0.04 \n" +
                "11.32 \n" +
                "0.08 \n" +
                "747.79 \n" +
                "0.08 \n" +
                "29.70 \n" +
                "0.08 \n" +
                "0.15 \n" +
                "1.38 \n" +
                "0.08 \n" +
                "1.38 \n" +
                "18.78 \n" +
                "103.54 \n" +
                "11.21 \n" +
                "1.76 \n" +
                "2078.07 \n" +
                "20224.78 \n" +
                "12327.18 \n" +
                "12810.00 \n" +
                "4142.52 \n" +
                "2696.40 \n" +
                "990.60 \n" +
                "1405.36 \n" +
                "2616.30 \n" +
                "21054.17 \n" +
                "2754.01 \n" +
                "12700.78 \n" +
                "1587.21 \n" +
                "1026.30 \n" +
                "9159.15 \n" +
                "1560.03 \n" +
                "17956.37 \n" +
                "1074.35 \n" +
                "6185.63 \n" +
                "5778.42 \n" +
                "10642.61 \n" +
                "538.22 \n" +
                "18706.21 \n" +
                "5132.53 \n" +
                "2066.92 \n" +
                "1492.87 \n" +
                "-1127.89 \n"

        val manualData: String = "4.34 \n" +
                "98.46 \n" +
                "136.73 \n" +
                "193.27 \n" +
                "37.26 \n" +
                "27.50 \n" +
                "293.25 \n" +
                "602.60 \n" +
                "260.17 \n" +
                "603.98 \n" +
                "125.40 \n" +
                "90.54 \n" +
                "355.21 \n" +
                "222.48 \n" +
                "11.32 \n" +
                "98.75 \n" +
                "19.90 \n" +
                "109.32 \n" +
                "18.78 \n" +
                "1.76 \n" +
                "11.21 \n" +
                "0.62 \n" +
                "494.69 \n" +
                "945.89 \n" +
                "2754.01 \n" +
                "1026.30 \n" +
                "1587.21 \n" +
                "12700.78 \n" +
                "99.01 \n" +
                "3117.70 \n" +
                "20224.78 \n" +
                "9159.15 \n" +
                "4600.04 \n" +
                "1560.03 \n" +
                "17956.37 \n" +
                "91.90 \n" +
                "51.77 \n" +
                "28.07 \n" +
                "151.68 \n" +
                "226.42 \n" +
                "1074.35 \n" +
                "1944.25 \n" +
                "6185.63 \n" +
                "5778.42 \n" +
                "41415.92 \n" +
                "10642.61 \n" +
                "243.00 \n" +
                "36.23 \n" +
                "195.58 \n" +
                "14.83 \n" +
                "4128.44 \n" +
                "161.06 \n" +
                "33.36 \n" +
                "161.06 \n" +
                "381.94 \n" +
                "1150.44 \n" +
                "1438.05 \n" +
                "966.37 \n" +
                "538.22 \n" +
                "5073.45 \n" +
                "5132.53 \n" +
                "18706.21 \n" +
                "2122.89 \n" +
                "2078.07 \n" +
                "1123.85 \n" +
                "384.45 \n" +
                "747.79 \n" +
                "2066.92 \n" +
                "12327.18 \n" +
                "12810.00 \n" +
                "990.60 \n" +
                "4142.52 \n" +
                "2696.40 \n" +
                "1405.36 \n" +
                "21054.17 \n" +
                "2616.30 \n" +
                "-1127.89\n" +
                "1127.89 \n" +
                "261.79 \n" +
                "98.83 \n" +
                "575.22 \n" +
                "64.08 \n" +
                "1992.56 \n" +
                "1265.49 \n" +
                "15.06 \n" +
                "2.47 \n" +
                "322.12 \n" +
                "677.44 \n" +
                "24.62 \n" +
                "164.67 \n" +
                "789.49 \n"

        val originalDataList = originalData.split("\n").filter { it.isNotEmpty() }.map { removeTrailingZeros(it.toFloat()) }.toMutableList()
        val manualDataList = manualData.split("\n").filter { it.isNotEmpty() }.map {removeTrailingZeros(it.toFloat()) }.toMutableList()
//        manualDataList.removeAll(originalDataList)
        manualDataList.removeAll(listOf("0.00"))

        removeIntersection(originalDataList.map { it.toFloat() }.toMutableList(),manualDataList.map { it.toFloat() }.toMutableList())
        return ""
    }

    fun removeIntersection(array1: MutableList<Float>, array2: MutableList<Float>) {
        val countMap1 = mutableMapOf<Float, Int>()
        val countMap2 = mutableMapOf<Float, Int>()

        // 统计 array1 中每个元素的出现次数
        for (element in array1) {
            countMap1[element] = (countMap1[element] ?: 0) + 1
        }

        // 统计 array2 中每个元素的出现次数
        for (element in array2) {
            countMap2[element] = (countMap2[element] ?: 0) + 1
        }

        // 找出两个数组中的交集元素并记录其最小出现次数
        val intersectionCountMap = mutableMapOf<Float, Int>()
        for ((key, value) in countMap1) {
            if (countMap2.containsKey(key)) {
                intersectionCountMap[key] = minOf(value, countMap2[key]!!)
            }
        }

        // 从 array1 中移除交集元素
        for ((key, count) in intersectionCountMap) {
            repeat(count) {
                array1.remove(key)
            }
        }

        // 从 array2 中移除交集元素
        for ((key, count) in intersectionCountMap) {
            repeat(count) {
                array2.remove(key)
            }
        }


        Log.d("ArrayTools", "originalDataList = ${array1}, manualDataList = ${array2}")
    }

    private fun removeTrailingZeros(number: Float): String {
        return String.format("%.2f", number) // 将 %.2f 改为其他需要保留小数位数的格式
    }

}