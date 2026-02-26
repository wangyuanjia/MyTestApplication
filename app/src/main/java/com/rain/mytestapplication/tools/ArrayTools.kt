package com.rain.mytestapplication.tools

import android.util.Log
import com.rain.mytestapplication.log

object ArrayTools {


    fun removeArrayElement(): String {
        val originalData: String = "57.52 \n" +
                "4486.73 \n" +
                "8628.32 \n" +
                "391.15 \n" +
                "677.38 \n" +
                "12654.87 \n" +
                "8007.08 \n" +
                "1127.43 \n" +
                "2342.30 \n" +
                "1518.58 \n" +
                "138.24 \n" +
                "145.31 \n" +
                "55.54 \n" +
                "94.69 \n" +
                "92.35 \n" +
                "88.53 \n" +
                "57.03 \n" +
                "5671.68 \n" +
                "4256.64 \n" +
                "2139.82 \n" +
                "4831.86 \n" +
                "5257.52 \n" +
                "5752.21 \n" +
                "10172.22 \n" +
                "16221.24 \n" +
                "3451.33 \n" +
                "16221.24 \n" +
                "-16221.24 \n" +
                "64.42 \n" +
                "1564.60 \n" +
                "27.61 \n" +
                "419.43 \n" +
                "8973.45 \n" +
                "11331.86 \n" +
                "414.16 \n" +
                "644.25 \n" +
                "322.12 \n" +
                "112.74 \n" +
                "112.74 \n" +
                "112.74 \n" +
                "112.74 \n" +
                "2264.15 \n" +
                "447.57 \n" +
                "241.59 \n" +
                "1023.90 \n" +
                "333.63 \n" +
                "940.49 \n" +
                "74.78 \n" +
                "161.06 \n" +
                "172.57 \n" +
                "1012.39 \n" +
                "1794.69 \n" +
                "110.44 \n" +
                "10238.94 \n" +
                "4601.77 \n" +
                "770.80 \n" +
                "4024.25 \n" +
                "3048.67 \n" +
                "115.04 \n" +
                "2174.34 \n" +
                "103.54 \n" +
                "356.64 \n" +
                "100.09 \n" +
                "100.09 \n" +
                "17.26 \n" +
                "241.02 \n" +
                "632.74 \n" +
                "9.20 \n" +
                "207.08 \n" +
                "1501.33 \n" +
                "276.11 \n" +
                "575.22 \n" +
                "1026.19 \n" +
                "23584.07 \n" +
                "920.35 \n" +
                "1138.94 \n" +
                "2296.52 \n" +
                "201.33 \n" +
                "1265.49 \n" +
                "4371.68 \n" +
                "1046.90 \n" +
                "1610.62 \n" +
                "2299.74 \n" +
                "1081.13 \n" +
                "15300.88 \n" +
                "1564.60 \n" +
                "1564.60 \n" +
                "253.10 \n" +
                "5729.20 \n" +
                "-1144.69 \n" +
                "-563.72 \n" +
                "-1564.60 \n" +
                "109.29 \n" +
                "1150.44 \n" +
                "1058.41 \n" +
                "276.11 \n" +
                "103.54 \n" +
                "103.54 \n" +
                "1038.27 \n" +
                "1144.69 \n" +
                "892.74 \n" +
                "2070.80 \n" +
                "1035.40 \n" +
                "1564.60 \n" +
                "3963.30 \n" +
                "-3963.30 \n" +
                "2716.98 \n" +
                "897.06 \n" +
                "644.25 \n" +
                "34.51 \n" +
                "109.29 \n" +
                "46.02 \n" +
                "5365.44 \n" +
                "5522.12 \n" +
                "-195.58 \n" +
                "4026.54 \n" +
                "1742.93 \n" +
                "5407.08 \n" +
                "411.86 \n" +
                "15548.23 \n" +
                "57.52 \n" +
                "132.30 \n" +
                "11.50 \n" +
                "621.24 \n"

        val manualData: String = "23584.07 \n" +
                "11331.86 \n" +
                "64.42 \n" +
                "5752.21 \n" +
                "4831.86 \n" +
                "322.12 \n" +
                "8628.32 \n" +
                "632.74 \n" +
                "1610.62 \n" +
                "138.24 \n" +
                "145.31 \n" +
                "55.54 \n" +
                "94.69 \n" +
                "92.35 \n" +
                "88.53 \n" +
                "57.03 \n" +
                "1046.90 \n" +
                "5257.52 \n" +
                "2070.80 \n" +
                "201.33 \n" +
                "5365.44 \n" +
                "253.10 \n" +
                "1150.44 \n" +
                "1127.43 \n" +
                "112.74 \n" +
                "112.74 \n" +
                "112.74 \n" +
                "112.74 \n" +
                "644.25 \n" +
                "16221.24 \n" +
                "3451.33 \n" +
                "103.54 \n" +
                "103.54 \n" +
                "46.02 \n" +
                "5522.12 \n" +
                "5671.68 \n" +
                "207.08 \n" +
                "2264.15 \n" +
                "575.22 \n" +
                "419.43 \n" +
                "391.15 \n" +
                "1023.90 \n" +
                "103.54 \n" +
                "276.11 \n" +
                "892.74 \n" +
                "1035.40 \n" +
                "1144.69 \n" +
                "2716.98 \n" +
                "897.06 \n" +
                "1742.93 \n" +
                "34.51 \n" +
                "109.29 \n" +
                "4026.54 \n" +
                "5407.08 \n" +
                "411.86 \n" +
                "10172.22 \n" +
                "15548.23 \n" +
                "2342.30 \n" +
                "27.61 \n" +
                "8973.45 \n" +
                "172.57 \n" +
                "333.63 \n" +
                "100.09 \n" +
                "100.09 \n" +
                "17.26 \n" +
                "241.02 \n" +
                "9.20 \n" +
                "276.11 \n" +
                "1138.94 \n" +
                "1265.49 \n" +
                "4371.68 \n" +
                "1081.13 \n" +
                "5729.20 \n" +
                "109.29 \n" +
                "1058.41 \n" +
                "1564.60 \n" +
                "1564.60 \n" +
                "1564.60 \n" +
                "115.04 \n" +
                "1794.69 \n" +
                "4024.25 \n" +
                "4486.73 \n" +
                "4601.77 \n" +
                "74.78 \n" +
                "940.49 \n" +
                "2174.34 \n" +
                "3048.67 \n" +
                "110.44 \n" +
                "161.06 \n" +
                "1038.27 \n" +
                "57.52 \n" +
                "677.38 \n" +
                "12654.87 \n" +
                "8007.08 \n" +
                "1518.58 \n" +
                "4256.64 \n" +
                "2139.82 \n" +
                "414.16 \n" +
                "644.25 \n" +
                "447.57 \n" +
                "241.59 \n" +
                "10238.94 \n" +
                "770.80 \n" +
                "356.64 \n" +
                "1501.33 \n" +
                "1026.19 \n" +
                "920.35 \n" +
                "2296.52 \n" +
                "2299.74 \n" +
                "15300.88 \n" +
                "1012.39 \n" +
                "-1144.69 \n" +
                "-563.72 \n" +
                "-195.58 \n" +
                "-1564.60 \n" +
                "1564.60 \n" +
                "16221.24 \n" +
                "-16221.24 \n" +
                "-3963.30 \n" +
                "3963.30 \n" +
                "57.52 \n" +
                "132.30 \n" +
                "11.50 \n" +
                "621.24 \n"

        val originalDataList = originalData.split("\n").filter { it.isNotEmpty() }.map { removeTrailingZeros(it.replace(",","").toFloat()) }.toMutableList()
        val manualDataList = manualData.split("\n").filter { it.isNotEmpty() }.map {removeTrailingZeros(it.replace(",","").toFloat()) }.toMutableList()
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


        Log.d("ArrayTools", "originalDataList = ${array1.filter { it.toDouble() !=0.0 }}, manualDataList = ${array2.filter { it.toDouble() != 0.0 }}")

        println("ArrayTools: originalDataList = ${array1.filter { it.toDouble() !=0.0 }}, manualDataList = ${array2.filter { it.toDouble() != 0.0 }}")
    }

    private fun removeTrailingZeros(number: Float): String {
        return String.format("%.2f", number) // 将 %.2f 改为其他需要保留小数位数的格式
    }

}