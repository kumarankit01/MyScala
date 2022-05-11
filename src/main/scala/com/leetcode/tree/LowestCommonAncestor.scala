package com.leetcode.tree

import com.leetcode.easy.TreeNode
import scala.collection.mutable.Stack

object LowestCommonAncestor extends App {
  def lowestCommonAncestor(root: TreeNode, p: TreeNode, q: TreeNode): TreeNode = {
    var currentNode: Option[TreeNode] = None
    val s1: Stack[TreeNode] = scala.collection.mutable.Stack[TreeNode]()
    val s2: Stack[TreeNode] = scala.collection.mutable.Stack[TreeNode]()

    def dfs(root: TreeNode, p: TreeNode, stack: Stack[TreeNode]): Unit = {
      if (root == null) {}
      else {
        dfs(root.left, p, stack)
        dfs(root.right, p, stack)
        if (root.value == p.value) {
          currentNode = Some(root)
          stack.push(root)
        }
        if (currentNode.isDefined &&
          ((root.left != null && root.left.value == currentNode.get.value) ||
            (root.right != null && root.right.value == currentNode.get.value))) {
          currentNode = Some(root)
          stack.push(root)
        }
      }
    }

    dfs(root, p, s1)
    dfs(root, q, s2)

    var result: TreeNode = null
    while (!s1.isEmpty && !s2.isEmpty) {
      if (s1.top.value == s2.top.value) result = s1.pop()
      s2.pop()
    }
    println(result.value)
    result
  }

  def lowestCommonAncestorNew(root: TreeNode, p: TreeNode, q: TreeNode): TreeNode = {
    if (root == null || root.value == p.value || root.value == q.value) root
    else {
      val left = lowestCommonAncestorNew(root.left, p, q)
      val right = lowestCommonAncestorNew(root.right, p, q)
      if (left == null) right
      else if (right == null) left
      else root
    }


    //def dfs(root: TreeNode, p: TreeNode, q: TreeNode): Unit =
  }

  lowestCommonAncestor(TreeNode(1,
    TreeNode(2,
      TreeNode(4, TreeNode(11), TreeNode(14)),
      TreeNode(5,
        TreeNode(6, TreeNode(8), TreeNode(9)),
        TreeNode(7))),
    TreeNode(3)), TreeNode(4), TreeNode(11))

  lowestCommonAncestor(TreeNode(1,
    TreeNode(2)), TreeNode(1), TreeNode(2))

  println(lowestCommonAncestorNew(TreeNode(1,
    TreeNode(2)), TreeNode(1), TreeNode(2)).value)

  println(lowestCommonAncestorNew(TreeNode(1,
    TreeNode(2,
      TreeNode(4, TreeNode(11), TreeNode(14)),
      TreeNode(5,
        TreeNode(6, TreeNode(8), TreeNode(9)),
        TreeNode(7))),
    TreeNode(3)), TreeNode(4), TreeNode(11)).value)
}
