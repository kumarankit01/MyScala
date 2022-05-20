package com.leetcode.tree

import com.leetcode.easy.TreeNode


object Forest_1110 extends App {
  def delNodes(root: TreeNode, to_delete: Array[Int]): List[TreeNode] = {

    import scala.collection.mutable._

    val listBuffer = ListBuffer.empty[TreeNode]
    val hashSet: HashSet[Int] = HashSet.from(to_delete)


    def dfs(root: TreeNode, toDelete: HashSet[Int]): TreeNode = {
      if (root == null) null
      else {
        root.left = dfs(root.left, toDelete)
        root.right = dfs(root.right, toDelete)
        if (to_delete.contains(root.value)) {
          // println(root.value)
          Option(root.left).map(listBuffer.append(_))
          Option(root.right).map(listBuffer.append(_))
          null
        } else root
      }
    }

    dfs(root, hashSet)
    if (!hashSet.contains(root.value)) listBuffer.append(root)
    listBuffer.foreach(a => println(a.value))
    listBuffer.toList
  }

  delNodes(TreeNode(1,
    TreeNode(2, TreeNode(4), TreeNode(6)), TreeNode(3, TreeNode(6), TreeNode(7))), Array(3, 5))
}
