package com.leetcode.tree

import com.leetcode.easy.TreeNode

import scala.annotation.tailrec

object ClosestValue_270 extends App {

  def closestValue(root: TreeNode, target: Double): Int = {
    var result = Integer.MIN_VALUE

    def compareAndUpdate(root: TreeNode, target: Double, currentDiff: Double): Double = {
      if (Math.abs(root.value - target) < currentDiff) {
        result = root.value
        Math.abs(root.value - target)
      } else currentDiff
    }

    @tailrec
    def bstSearch(root: TreeNode, target: Double, currentDiff: Double): Unit = {
      if (root == null) {}
      else if (currentDiff == 0) {}
      else {
        val newDiff = compareAndUpdate(root, target, currentDiff)

        if (target <= root.value)
          bstSearch(root.left, target, newDiff)
        else
          bstSearch(root.right, target, newDiff)
      }
    }

    bstSearch(root, target, Integer.MAX_VALUE)
    result
  }

  println(closestValue(TreeNode(1, null, TreeNode(5, TreeNode(3))), 2.0001))

}
