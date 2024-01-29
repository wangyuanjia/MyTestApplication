package com.rain.mytestapplication.tools

class TikTokTest {
//    Contiguous subarrays are a group of an uninterrupted range of elements from an array as they occur.
//    No elements in the range can be skipped or reordered. Given an array of integers, numbers, and an integer k,
//    determine the total number of subarrays of numbers that have a product that is less than or equal to k.
//
//    Example
//
//    numbers = [2, 3, 4]
//
//    The subarrays are [, , , [2, 3], [3, 4], [2, 3, 4]].
//    The product of a subarray is the product of all of its elements
//    so the products for the list of subarrays are [2, 3, 4, 6, 12, 24]. If k = 6, 4 subarrays satisfy the condition, , , , [2, 3].
//
//    Function Description
//
//    Complete the function count in the editor below.
//
//
//
//    count has the following parameter(s):
//
//    int numbers: an array of integers
//
//    k: an integer
//
//
//
//    Returns
//
//    long int: the number of subarrays whose product is less than or equal to k
//
//
//
//    Constraints
//
//    1 ≤ n ≤ 5 × 105
//    1 ≤ numbers ≤ 100
//    1 ≤ k ≤ 106

//    Example
//
//    numbers = [2, 3, 4,5]
//    The subarrays are [, , , [2, 3], [3, 4], [2, 3, 4]].
//    k=6

//1.find all subarray
//2.have one judge if  less than or equal k  not *all the element in each array if  less than or equal k
//3.return the number

    var number:Long = 0
    var sum = 1
    fun countSubarrays(numbers: Array<Int>, k: Int): Long {
        // Write your code here
        for(i in numbers.indices){
            //numbers[i]
            //numbers[i]*numbers[i+1]
            //numbers[i]*numbers[i+1]*numbers[i+2]

            for (j in i until numbers.size){
                sum = sum.times(numbers[j])
                if (sum <= k){
                    number++
                }
            }
        }
        return number
    }



}