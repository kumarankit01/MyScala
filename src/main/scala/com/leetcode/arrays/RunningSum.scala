package com.leetcode.arrays


object RunningSum extends App {

  def runningSum(nums: Array[Int]): Array[Int] = {
    val arr = scala.collection.mutable.ArrayBuffer.empty[Int]
    nums.foldLeft(arr) {
      (arr, i) => arr.append(arr.lastOption.getOrElse(0) + i)
    }.toArray

    nums.scanLeft(0)(_ + _)
  }


  runningSum(Array(1, 2, 3, 4)).map(println(_))
}