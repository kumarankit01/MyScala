package com.leetcode.easy

import scala.annotation.tailrec

/*

Input: l1 = [], l2 = []
Output: []

Input: l1 = [1,2,4], l2 = [1,3,4]
Output: [1,1,2,3,4,4]

Input: l1 = [], l2 = [0]
Output: [0]
 */

class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}


object Leet21_MergeTwoSortedLists extends App {

  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    /*    if (l1 == null && l2 == null) null
        else {
          val mergedList = new ListNode()
          merger(l1, l2, mergedList)

          //remove last node as 0
          var p = mergedList
          while (p.next.next != null) {
            p = p.next
          }
          p.next = null

          mergedList
        }*/

    val mergeV2 = new ListNode()

    @tailrec
    def mergerV2(l1: ListNode, l2: ListNode, l3: ListNode): Unit = {
      (l1, l2) match {
        case (null, null) =>
        case (null, l2: ListNode) => l3.next = l2
        case (l1: ListNode, null) => l3.next = l1
        case (l1: ListNode, l2: ListNode) if l1.x <= l2.x =>
          l3.next = new ListNode(l1.x)
          mergerV2(l1.next, l2, l3.next)
        case (l1: ListNode, l2: ListNode) if (l1.x > l2.x) =>
          l3.next = new ListNode(l2.x)
          mergerV2(l1, l2.next, l3.next)
      }
    }

    mergerV2(l1, l2, mergeV2)
    mergeV2.next

  }

  def merger(l1: ListNode, l2: ListNode, merged: ListNode): ListNode = {
    if (l1 == null && l2 == null) merged
    else if (l2 == null) { //l2 empty then add l1
      merged.x = l1.x
      merged.next = new ListNode()
      merger(l1.next, l2, merged.next)
    }
    else if (l1 == null) { //l1 empty then add l2
      merged.x = l2.x
      merged.next = new ListNode()
      merger(l1, l2.next, merged.next)
    }
    else if (l1.x < l2.x) {
      merged.x = l1.x
      merged.next = new ListNode()
      merger(l1.next, l2, merged.next)
    }
    else {
      merged.x = l2.x
      merged.next = new ListNode()
      merger(l1, l2.next, merged.next)
    }

  }


  println(mergeTwoLists(new ListNode(3, new ListNode(4)), new ListNode(1, new ListNode(2))))
  //println(mergeTwoLists(null, null))
  //println(mergeTwoLists(null, null))
}
