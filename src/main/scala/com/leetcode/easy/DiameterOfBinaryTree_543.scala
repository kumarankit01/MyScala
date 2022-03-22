package com.leetcode.easy

object DiameterOfBinaryTree_543 extends App {
  var max = 0

  def diameterOfBinaryTreeNew(root: TreeNode): Int = {
    longestPath(root) //TODO: print path
    max
  }

  private def longestPath(root: TreeNode): Int = {
    if (root == null) 0
    else {
      val left = longestPath(root.left)
      val right = longestPath(root.right)
      max = Math.max(max, left + right)
      Math.max(left, right) + 1
    }
  }

  /**
   * follow up, print path
   */

  println(diameterOfBinaryTreeNew(TreeNode(1)))
  println(diameterOfBinaryTreeNew(TreeNode(1, null, TreeNode(2))))
  println(diameterOfBinaryTreeNew(TreeNode(1, TreeNode(2), null)))
  println(diameterOfBinaryTreeNew(TreeNode(1,
    TreeNode(2, TreeNode(3, TreeNode(4))))))
  println(diameterOfBinaryTreeNew(TreeNode(1,
    TreeNode(2,
      TreeNode(4, TreeNode(11), TreeNode(14)),
      TreeNode(5,
        TreeNode(6, TreeNode(8), TreeNode(9)),
        TreeNode(7))),
    TreeNode(3))))
}
