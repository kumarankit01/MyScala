package com.leetcode.easy

object LargestSubstring_1624 extends App {
  def maxLengthBetweenEqualCharacters(s: String): Int = {

    var minDifference = -1
    s map {
      c => {
        val first = s.indexOf(c)
        val last = s.lastIndexOf(c)
        if (first != last && (last - first - 1 > minDifference)) minDifference = last - first - 1
      }
    }
    minDifference

  }

  println(maxLengthBetweenEqualCharacters("zabcaz"))
  println(maxLengthBetweenEqualCharacters("abc"))
  println(maxLengthBetweenEqualCharacters("aa"))
}
