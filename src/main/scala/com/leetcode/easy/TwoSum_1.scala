package com.leetcode.easy

object TwoSum_1 extends App {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val sorted = nums.zipWithIndex.sorted
    var i = 0
    var j = sorted.length - 1
    var arr: Array[Int] = Array()
    while (i < j && arr.length == 0) {
      if (sorted(i)._1 + sorted(j)._1 == target) arr = Array(sorted(i)._2, sorted(j)._2)
      else if (sorted(i)._1 + sorted(j)._1 > target) j = j - 1
      else i = i + 1
    }
    arr
  }

  def twoSumModified(nums: Array[Int], target: Int): Array[Int] = {
    val withIndex: Array[(Int, Int)] = nums.zipWithIndex
    val hashmap: Map[Int, Int] = withIndex.toMap
    withIndex.collectFirst {
      case (v, i) if hashmap.get(target - v).exists(_ != i) => Array(i, hashmap(target - v))
    }.getOrElse(Array.empty)
  }

  twoSum(Array(2, 7, 11, 15), 9)
  twoSum(Array(3, 2, 4), 6)
  twoSum(Array(3, 3), 6)
}
