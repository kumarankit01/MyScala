package com.leetcode.tree

import com.leetcode.easy.TreeNode

import scala.collection.mutable.ListBuffer

object LeavesOfBinaryTree extends App {

  def findLeaves(root: TreeNode): List[List[Int]] = {
    val bfsList: ListBuffer[ListBuffer[Int]] = ListBuffer.empty

    def getHeight(root: TreeNode): Int = {
      if (root == null) -1
      else {
        val height = 1 + Math.max(getHeight(root.left), getHeight(root.right))
        if (bfsList.isEmpty || bfsList.size <= height)
          bfsList.insert(height, ListBuffer(root.value))
        else
          bfsList(height).addOne(root.value)
        height

      }
    }

    getHeight(root)
    bfsList.toList.map(_.toList)

  }


  /*  def bfs(root: TreeNode, height: Int, leaf: ListBuffer[Int], bfsList: ListBuffer[ListBuffer[Int]]): Unit = {
      if (root == null) {}
      else if (root.left == root.right && root.left == null) {
        leaf += root.value
      }
      else {
        if (bfsList.isEmpty || bfsList.size <= height) {
          bfsList.insert(height, ListBuffer(root.value))
        }
        else {
          bfsList(height).addOne(root.value)
        }
        bfs(root.left, height + 1, leaf, bfsList)
        bfs(root.right, height + 1, leaf, bfsList)
      }*/





  println(findLeaves(TreeNode(37,
    TreeNode(-34, null, TreeNode(-100)),
    TreeNode(-48, TreeNode(-100), TreeNode(48, TreeNode(54, TreeNode(71), TreeNode(22, null, TreeNode(8))))))))
}
