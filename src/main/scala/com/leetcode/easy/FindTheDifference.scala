package com.leetcode.easy

object FindTheDifference extends App {
  def findTheDifference(s: String, t: String): Char = {
    t.collectFirst {
      case c if !s.contains(c) || t.count(_ == c) != s.count(_ == c) => c
    }.getOrElse(' ')
  }

  def findTheDifferenceNew(s: String, t: String): Char = {
    (t.sum - s.sum).toChar
  }

  println(findTheDifferenceNew("a", "aa"))
  println(findTheDifferenceNew("abcd", "abcde"))
}
