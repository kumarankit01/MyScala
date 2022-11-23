package com.leetcode.easy

object RangeSum_938 extends App {

  def rangeSumBST(root: TreeNode, low: Int, high: Int): Int = {
    var acc = 0

    def dfs(root: TreeNode, low: Int, high: Int): Int = {
      if (root == null) 0
      else {
        var adder = 0
        if ((root.value >= low && root.value <= high)) {
          println(s"root = ${root.value}")
          acc += root.value
        }
        dfs(root.left, low, high )
        dfs(root.right, low, high )
        acc
      }
    }

    dfs(root, low, high)

  }

  println(rangeSumBST(TreeNode(1,
    TreeNode(2,
      TreeNode(4, TreeNode(11), TreeNode(14)),
      TreeNode(5,
        TreeNode(6, TreeNode(8), TreeNode(9)),
        TreeNode(7))),
    TreeNode(3)), 4, 11))
}



