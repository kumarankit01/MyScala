package com.leetcode.random

trait AgodaTypeSerializer[T] {
  def toAgodaResponse: T
}
