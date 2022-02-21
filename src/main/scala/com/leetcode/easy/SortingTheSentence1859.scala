package com.leetcode.easy

object SortingTheSentence1859 extends App {
  def sortSentence(s: String): String = {
    val words: Array[String] = s.split(" ")
    val index: Array[Int] = words.map(s => s.charAt(s.length - 1).toInt)
    words.map(s => s.dropRight(1)).zip(index).sortBy(_._2).map(_._1).mkString(" ")
  }

  sortSentence("Myself2 Me1 I4 and3")
}
