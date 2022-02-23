package com.leetcode.easy

object SortArrayByParity extends App {
  def sortArrayByParity(nums: Array[Int]): Array[Int] = {
    var i = 0
    var j = nums.length - 1
    while (i < j) {
      if (nums(i) % 2 > nums(j) % 2) swap(i, j)
      if (nums(i) % 2 == 0) i += 1
      if (nums(j) % 2 == 1) j -= 1
    }

    def swap(i: Int, j: Int) = {
      val temp = nums(i)
      nums(i) = nums(j)
      nums(j) = temp
    }

    nums
  }

  def sortArrayByParityX(A: Array[Int]): Array[Int] = {
    A.groupBy(_ % 2 != 0).values.flatten.toArray
  }


  sortArrayByParity(Array(1))
  sortArrayByParity(Array(0))
  sortArrayByParity(Array(1, 1))
  sortArrayByParity(Array(3, 1, 2, 4))
}
