package com.leetcode.easy


//https://en.wikipedia.org/wiki/Binary_search_algorithm#Implementation_issues

object VersionControl extends App {
  def isBadVersion(version: Int): Boolean = if (version > 8) true else false

  def firstBadVersion(n: Int): Int = {
    var low = 1
    var high = n
    while (low < high) {
      val mid = low + ((high - low) / 2) //low + high /2 throws overflow
      if (isBadVersion(mid)) high = mid
      else
        low = mid + 1
    }
    low
  }

  println(firstBadVersion(Integer.MAX_VALUE))
}
