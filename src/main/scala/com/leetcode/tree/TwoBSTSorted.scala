package com.leetcode.tree

import com.leetcode.easy.TreeNode

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer

object TwoBSTSorted extends App {


  def getAllElements(root1: TreeNode, root2: TreeNode): List[Int] = {

    def sortedElements(root: TreeNode): ListBuffer[Int] = {
      val elements = ListBuffer[Int]()

      def getInorder(root: TreeNode): Unit = {
        if (root == null) {}
        else {
          getInorder(root.left)
          elements += root.value
          getInorder(root.right)
        }
      }

      getInorder(root)
      elements foreach println
      elements
    }

    def mergeList(list1: List[Int], list2: List[Int]): List[Int] = {

      (list1, list2) match {
        case (Nil, Nil) => Nil
        case (Nil, head :: tail) => list2
        case (head :: tail, Nil) => list1
        case (a :: aa, b :: bb) => if (a < b) a :: mergeList(list1.tail, list2) else b :: mergeList(list1, list2.tail)

      }
    }

    val listRoot1 = sortedElements(root1).toList
    val listRoot2 = sortedElements(root2).toList

    val result = mergeList(listRoot1, listRoot2)

    result foreach println
    result

  }
}
