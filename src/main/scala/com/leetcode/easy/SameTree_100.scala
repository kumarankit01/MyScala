package com.leetcode.easy


object SameTree_100 extends App {
  def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
    // both null
    // both not null and isSame value
    var isSame = true

    def dfs(p: TreeNode, q: TreeNode): Unit = {
      if (p == null && q == null) {}
      else if ((p != null && q != null && p.value == q.value) && isSame) {
        dfs(p.left, q.left)
        dfs(p.right, q.right)

      } else {
        isSame = false
      }
    }

    dfs(p, q)
    isSame
  }

  println(isSameTree(TreeNode(1, null, TreeNode(5, TreeNode(3))), TreeNode(1, null, TreeNode(5, TreeNode(3)))))
}
