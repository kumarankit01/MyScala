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

    case class Log(timestamp: Int, message: String) // DS to store log

    var list = new scala.collection.mutable.ListBuffer[Log]() // to keep timestamp
    var messages = scala.collection.mutable.HashSet[String]() // to keep unique message in last 10 unit of time

    def shouldPrintMessageUpdated(timestamp: Int, message: String): Boolean = {

      //first we do clean up - GC
      while (!list.isEmpty && timestamp - list.headOption.map(_.timestamp).getOrElse(Int.MinValue) >= 10) {
        /*
          remove all the message from head of list which are older than 10 unit of time
          also clean HashSet
         */
        messages.remove(list.head.message)
        list = list.drop(1)
      }
      if (messages.contains(message)) false
      else {
        list += Log(timestamp, message)
        messages.add(message)
        true
      }
    }
  }


  val logger = new Logger()
  println(logger.shouldPrintMessageUpdated(1, "foo")) // return true, next allowed timestamp for "foo" is 1 + 10 = 11

  println(logger.shouldPrintMessageUpdated(2, "bar")) // return true, next allowed timestamp for "bar" is 2 + 10 = 12

  println(logger.shouldPrintMessageUpdated(3, "foo")) // 3 < 11, return false

  println(logger.shouldPrintMessageUpdated(8, "bar")) // 8 < 12, return false

  println(logger.shouldPrintMessageUpdated(11, "foo")) // 10 < 11, return false

  println(logger.shouldPrintMessageUpdated(11, "foo"))
  println(logger.shouldPrintMessageUpdated(32, "foo1"))
  println(logger.shouldPrintMessageUpdated(32, "foo2"))
  println(logger.shouldPrintMessageUpdated(32, "fo3o"))
  println(logger.shouldPrintMessageUpdated(32, "fo54o"))
  println(logger.shouldPrintMessageUpdated(32, "fo6o"))
  println(logger.shouldPrintMessageUpdated(32, "fo7o"))
}
