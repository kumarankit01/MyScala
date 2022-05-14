package com.leetcode.arrays

import scala.collection.mutable.{ListBuffer, Queue}

object MovingAverage extends App {
  val mv = MovingAverageCircularQueue(3)
  println(mv.next(1))
  println(mv.next(10))
  println(mv.next(3))
  println(mv.next(5))
}

case class MovingAverage(_size: Int) {
  var sum = 0
  var list: ListBuffer[Int] = ListBuffer[Int]()

  def next(`val`: Int): Double = {
    sum += `val`
    if (list.size == _size) sum = sum - list(list.length - 1)
    list = list.prepend(`val`).take(_size)
    sum.toDouble / list.size
  }

}

case class MovingAverageQueue(_size: Int) {
  var sum = 0
  var ints = Queue[Int]()

  def next(`val`: Int): Double = {
    sum += `val`
    if (ints.size == _size) sum = sum - ints.dequeue()
    ints.enqueue(`val`)
    sum.toDouble / ints.size
  }

}

case class MovingAverageCircularQueue(_size: Int) {
  var sum = 0
  var circularQueue = Array.fill(_size) {
    0
  }
  var head = 0
  var count = 0

  def next(`val`: Int): Double = {
    count = if (count == _size) count else count + 1
    val tail = (head + 1) % _size
    sum = sum + `val` - circularQueue(tail)
    head = tail
    circularQueue(head) = `val`
    sum.toDouble / count
  }

}