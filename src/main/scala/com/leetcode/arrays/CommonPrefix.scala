package com.leetcode.arrays

object CommonPrefix extends App {


  def longestCommonPrefix(strs: Array[String]): String = {
    var continueCheck = true
    if (strs.exists(_.isEmpty) || strs.length == 0) ""
    else if (strs.length == 1) strs.head
    else {
      val common = new StringBuilder()
      for (i <- 0 until strs.head.length if continueCheck) {
        val notMatched = strs.collectFirst {
          case s if s.length <= i || s.charAt(i) != strs.head.charAt(i) => s
        }.getOrElse("")
        if(notMatched.isEmpty) common.append(strs.head.charAt(i))
        else continueCheck = false
      }
      common.toString()
    }
  }


  println(longestCommonPrefix(Array("cir", "car")))
  println(longestCommonPrefix(Array("aa")))
  println(longestCommonPrefix(Array("")))
  println(longestCommonPrefix(Array("", "")))
  println(longestCommonPrefix(Array("aaaaaaaa", "aaaa", "aaab")))
}
