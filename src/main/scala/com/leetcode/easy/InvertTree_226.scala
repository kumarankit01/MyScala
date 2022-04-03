package com.leetcode.easy


object InvertTree_226 extends App {


  def invertTree(root: TreeNode): TreeNode = {

    def swap(node: TreeNode): TreeNode = {
      val left = node.left
      node.left = node.right
      node.right = left
      node
    }

    if (root != null) {
      val node = swap(root)
      invertTree(node.left)
      invertTree(node.right)
    }
    root
  }

  def log(root: TreeNode): Unit = {
    if (root != null) {
      print(" " + root._value.toString + " ")
      log(root.left)
      log(root.right)
    }

  }

  /**
   * 8
   * 2
   *
   * 8
   * 2
   */
  //println(invertTree(TreeNode(1)))
  // println(log(invertTree(TreeNode(1, TreeNode(1), TreeNode(3)))))
  //  println(invertTree(TreeNode(1, TreeNode(2), TreeNode(1))))
  //  println(invertTree(TreeNode(1, TreeNode(1, TreeNode(1)), TreeNode(1))))
  println(log(invertTree(TreeNode(45, TreeNode(11, TreeNode(13)), TreeNode(41)))))
  //  println(invertTree(TreeNode(1, TreeNode(1, TreeNode(2)), TreeNode(1))))
  //  println(invertTree(TreeNode()))
}
