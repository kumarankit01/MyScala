package com.leetcode.easy

import scala.annotation.tailrec

object Max_consecutive_485 extends App {
  def findMaxConsecutiveOnes(nums: Array[Int]): Int = {
    var max = 0
    var local = 0
    for (i <- 0 until nums.length) {
      if (nums(i) == 1) {
        local += 1
      } else {
        max = Math.max(max, local)
        local = 0
      }
    }
    max = Math.max(max, local)
    max
  }

  def findMaxConsecutiveOnesTail(nums: Array[Int]): Int = {
    @tailrec
    def helper(ys: Array[Int], currMax: Int = 0, max: Int = 0): Int = ys match {
      case Array() => max
      case Array(1, _*) => helper(ys.tail, currMax + 1, if (currMax + 1 > max) currMax + 1 else max)
      case Array(_, _*) => helper(ys.tail, 0, max)
    }

    helper(nums)
  }

  println(findMaxConsecutiveOnes(Array(0)))
  println(findMaxConsecutiveOnes(Array(1)))
  println(findMaxConsecutiveOnes(Array(1, 1, 1, 0, 1)))
}
