package com.leetcode.arrays

object MinimumTimeDifference extends App {
  def findMinDifference(timePoints: List[String]): Int = {
    var min = Integer.MAX_VALUE

    val times: Seq[Int] = timePoints.map {
      t => t.split(":")
    }.map(t => t(0).toInt * 60 + t(1).toInt).sorted
    for (i <- 1 until times.length) {
      val diff = times(i) - times(i - 1)
      if (diff < min) min = diff
    }
    val last = times.head + (24 * 60 - times.last)
    if (last < min) min = last
    println(min)
    min
  }

  /*  findMinDifference(List("12:00", "23:59"))
    findMinDifference(List("12:01", "23:59"))
    findMinDifference(List("12:02", "23:59"))
    findMinDifference(List("12:00", "00:00"))
    findMinDifference(List("12:00", "00:00", "00:00"))

    findMinDifference(List("00:00", "23:59"))
    findMinDifference(List("00:00", "23:00"))
    findMinDifference(List("00:00", "22:00"))*/
  //findMinDifference(List("12:00", "00:00"))
  findMinDifference(List("12:12", "00:13"))

}
