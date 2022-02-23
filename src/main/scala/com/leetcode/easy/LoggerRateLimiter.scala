package com.leetcode.easy

object LoggerRateLimiter extends App {
  class Logger {
    val map = scala.collection.mutable.Map[String, Int]()

    def shouldPrintMessage(timestamp: Int, message: String): Boolean = {
      val isAllowed = map.get(message) match {
        case Some(nextAllowedTime) if nextAllowedTime <= timestamp =>
          map += (message -> (timestamp + 10))
          true
        case Some(_) => false
        case None =>
          map += (message -> (timestamp + 10))
          true
      }
      isAllowed
    }
  }


  val logger = new Logger()
  logger.shouldPrintMessage(1, "foo") // return true, next allowed timestamp for "foo" is 1 + 10 = 11

  logger.shouldPrintMessage(2, "bar") // return true, next allowed timestamp for "bar" is 2 + 10 = 12

  logger.shouldPrintMessage(3, "foo") // 3 < 11, return false

  logger.shouldPrintMessage(8, "bar") // 8 < 12, return false

  logger.shouldPrintMessage(10, "foo") // 10 < 11, return false

  logger.shouldPrintMessage(11, "foo")
}
