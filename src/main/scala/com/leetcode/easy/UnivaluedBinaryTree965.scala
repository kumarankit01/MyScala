package com.leetcode.easy


case class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right
}

object UnivaluedBinaryTree965 extends App {
  def isUnivalTree(root: TreeNode): Boolean = {
    if (root == null) return true
    else if (root.left != null && root.value != root.left.value)
      return false
    else if (root.right != null && root.value != root.right.value)
      return false
    isUnivalTree(root.left) && isUnivalTree(root.right)
  }


  println(isUnivalTree(TreeNode(1, TreeNode(1), TreeNode(1))))
  println(isUnivalTree(TreeNode(1, TreeNode(2), TreeNode(1))))
  println(isUnivalTree(TreeNode(1, TreeNode(1, TreeNode(1)), TreeNode(1))))
  println(isUnivalTree(TreeNode(45, TreeNode(1, TreeNode(1)), TreeNode(1))))
  println(isUnivalTree(TreeNode(1, TreeNode(1, TreeNode(2)), TreeNode(1))))
  println(isUnivalTree(TreeNode()))
}
