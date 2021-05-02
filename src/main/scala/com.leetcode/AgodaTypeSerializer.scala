package com.leetcode

trait AgodaTypeSerializer[T] {
def toAgodaResponse: T
}
