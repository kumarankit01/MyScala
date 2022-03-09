package com.leetcode.easy

object Minimum_Absolute_Difference_1200 extends App {
  def minimumAbsDifference(arr: Array[Int]): List[List[Int]] = {
    var seq = List[List[Int]]()
    var minDiff = Integer.MAX_VALUE
    arr.sorted.sliding(2).foreach { c =>
      val curDiff = (c(1) - c(0)).abs
      if (curDiff < minDiff) {
        minDiff = curDiff
        seq = List(List(c(0), c(1)))
      } else if (curDiff == minDiff) {
        seq = seq :+ List(c(0), c(1))
      }
    }
    seq
  }

  minimumAbsDifference(Array(1, 3, 5, 77))
  minimumAbsDifference(Array(4, 2, 1, 3))
  minimumAbsDifference(Array(4, 2))
  minimumAbsDifference(Array(3, 8, -10, 23, 19, -4, -14, 27))
}
