package com.leetcode.tree


class Node(var _value: Int) {
  var value: Int = _value
  var left: Node = null
  var right: Node = null
  var parent: Node = null
}

object LCA extends App {

  import scala.collection.mutable.ListBuffer

  def findCommon(l1: List[Node], l2: List[Node], acc: Node): Node = {
    // 1,2  1,2,3

    (l1, l2) match {
      case (a :: _, b :: _) if a == b =>
        println(a.value)
        findCommon(l1.tail, l2.tail, a)
      case _ => acc
    }
  }

  def getParents(p: Node): ListBuffer[Node] = {
    val list = ListBuffer.empty[Node]

    def dfs(n: Node): Unit = {
      if (n == null) {}
      else {
        list.prepend(n)
        dfs(n.parent)
      }
    }

    dfs(p)
    list
  }

  def dfsNew(n: Node): List[Node] = {
    if (n == null) Nil
    else {
      n :: dfsNew(n.parent)
    }
  }

  def findCommonNew(l1: List[Node], l2: List[Node]): Node = {
    // 1,2  1,2,3

    l1.find(l2.contains).getOrElse(null)
  }

  def lowestCommonAncestor(p: Node, q: Node): Node = {
    //findCommon(getParents(p).toList, getParents(q).toList, null)
    findCommonNew(dfsNew(p), dfsNew(q))
  }


}
