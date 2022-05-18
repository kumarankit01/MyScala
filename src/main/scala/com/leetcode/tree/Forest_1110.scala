package com.leetcode.tree

import com.leetcode.easy.TreeNode

import scala.collection.mutable._

object Forest_1110 extends App {
  def delNodes(root: TreeNode, to_delete: Array[Int]): List[TreeNode] = {
    val array = ArrayBuffer.empty[Int]

    def dfs(root: TreeNode): List[TreeNode] = {
      if (root == null) List()
      else {
        dfs(root.left)
        dfs(root.right)
        if (to_delete.contains(root.value)) {

          array ++= Array(Option(root.left), Option(root.right)).flatten.map(_.value)
          root
        } else null
      }
    }

    dfs(root)
    println(array)
    List.empty
  }
  delNodes(TreeNode(1,
    TreeNode(2, null, TreeNode(3))), Array(2))
}
