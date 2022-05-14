package com.leetcode.tree

import com.leetcode.easy.TreeNode

object SymetricTree101 extends App {
  def isSymmetric(root: TreeNode): Boolean = {
    if (root == null) true
    else {
      matchSubTree(root.left, root.right)
    }
  }

  def matchSubTree(root1: TreeNode, root2: TreeNode): Boolean = {
    if (root1 == null && root2 == null) true
    else if(root1 != root2) false
    else {
      root1.value == root2.value &&
        matchSubTree(root1.left, root2.right) &&
        matchSubTree(root1.right, root2.left)
    }
  }

  println(isSymmetric(TreeNode(1,
    TreeNode(2, null, TreeNode(3)), TreeNode(2, TreeNode(3), null))))
}



