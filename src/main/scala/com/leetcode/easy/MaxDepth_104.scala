package com.leetcode.easy

import scala.annotation.tailrec

object MaxDepth_104 extends App {
  def maxDepth(root: TreeNode): Int = {
    if (root == null) 0
    else
      Math.max(maxDepth(root.left), maxDepth(root.right)) + 1
  }


  def maxDepthBFS(root: TreeNode): Int = {
    @tailrec
    def bfs(breath: List[TreeNode], acc: Int): Int = breath match {
      case Nil => acc
      case _ =>
        val b: List[TreeNode] = breath.flatMap(r => List(Option(r.left), Option(r.right))).flatten
        bfs(b, acc+1)
    }
    if (root == null) 0 else bfs(List(root), 0)
  }

  println(maxDepth(TreeNode(1, TreeNode(1), TreeNode(1))))
  println(maxDepth(TreeNode(1, TreeNode(2), TreeNode(1))))
  println(maxDepth(TreeNode(1, TreeNode(1, TreeNode(1)), TreeNode(1))))
  println(maxDepth(TreeNode(45, TreeNode(1, TreeNode(1)), TreeNode(1))))
  println(maxDepthBFS(TreeNode(1, TreeNode(1, TreeNode(2)), TreeNode(1))))
  println(maxDepth(TreeNode(0)))
  println(maxDepth(null))
}

/**
 * 5
 * 2       11
 */