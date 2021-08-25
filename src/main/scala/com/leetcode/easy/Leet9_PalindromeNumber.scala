package com.leetcode.easy

/*
Test cases

121 - 121 - true
001 - 100 - false
1 - 1     - true
-121 - 121 - false
 */


object Leet9_PalindromeNumber extends App {

/*  println(Integer.MAX_VALUE)
  println(Integer.MAX_VALUE.toString.reverse.toInt)*/

  def isPalindrome(x: Int): Boolean = {
    val s1 = x.toString
    val s2 = s1.reverse
    if (s1.equalsIgnoreCase(s2)) true else false
  }
  println(isPalindrome(121))
  println(isPalindrome(0))
  println(isPalindrome(1))
  println(isPalindrome(-121))
  println(isPalindrome(10))
  println(isPalindrome(-101))
  println(isPalindrome(Integer.MAX_VALUE))
  println(isPalindrome(Integer.MIN_VALUE))
}
