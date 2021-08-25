package com.leetcode

object Solution extends App {

  def rev2(a: Int, acc: String): String = {
    if (a == 0) acc
    else {
      val num = a % 10
      rev2(a / 10, acc + Math.abs(num))
    }
  }
  def reverse(x: Int): Int = {
    val s = rev2(x, "")
    val abs = if (s == "" || s.toLong > Integer.MAX_VALUE || s.toLong < Integer.MIN_VALUE) {
      0
    } else {
      s.toInt
    }
    if (x < 0) {
      abs * -1
    }
    else abs
  }


  println(reverse(-10))
}


