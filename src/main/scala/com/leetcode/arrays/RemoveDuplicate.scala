package com.leetcode.arrays

object RemoveDuplicate extends App {
  def removeDuplicates(nums: Array[Int]): Int = {
    def recurse(nums: Array[Int], acc: Array[Int]): Int = {
      nums.headOption match {
        case Some(h) => recurse(nums.dropWhile(_ == h), acc.appended(h))
        case None => acc.length
      }
    }

    recurse(nums, Array())
  }

  removeDuplicates(Array(1, 1, 2))
}
