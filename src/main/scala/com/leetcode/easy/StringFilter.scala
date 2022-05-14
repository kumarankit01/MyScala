package com.leetcode.easy

object StringFilter extends App {
  def checkRecord(s: String): Boolean = {
    s.filter(_ == 'A').size < 2 && !s.toSeq.sliding(3).map((s) => s.unwrap.equalsIgnoreCase("LLL")).reduce(_ || _)

  }

  def checkRecordV2(s: String): Boolean = {
    s.count(_ == 'A') < 2 && !s.contains("LLL")
  }
}
