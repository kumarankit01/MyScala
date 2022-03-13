package com.leetcode.easy

object MaxPower1446 extends App {
  def maxPower(s: String): Int = {
    var max = 1
    var i = 0
    while (i < s.length - 1) {
      var count = 1
      while (i < s.length - 1 && s(i) == s(i + 1)) {
        count += 1
        i += 1
      }
      if (max < count) max = count
      i += 1
    }
    max
  }

  println(maxPower("abc"))
  println(maxPower("abbcccddddeeeeedcba"))
  println(maxPower("leetcode"))
}
