package com.leetcode.tree

import com.leetcode.easy.TreeNode

object LeavesOfBinaryTree extends App {
  val array: List[List[Int]] = List(List())

  def findLeaves(root: TreeNode): List[List[Int]] = {
    if (root == null) List(List())
    else {
      dfs(List(root))
    }

    def dfs(tree: List[TreeNode]): Unit = {
      val nextNode = List[TreeNode]()
      tree.map {
        n => ???
      }
    }
    array
  }
}
