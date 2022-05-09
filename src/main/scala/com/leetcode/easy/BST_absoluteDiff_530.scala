package com.leetcode.easy

object BST_absoluteDiff_530 extends App {

  def getMinimumDifference(root: TreeNode): Int = {
    var prev = -1
    var min = Integer.MAX_VALUE

    /** Inorder travel in BST
     *
     * @param root
     */
    def dfs(root: TreeNode): Unit = {
      if (root != null) {
        dfs(root.left)
        if (prev != -1) {
          min = Math.min(Math.abs(prev - root.value), min)
          prev = root.value
        } else {
          prev = root.value
        }
        dfs(root.right)

      } else {}
    }

    dfs(root)
    min
  }


  println(getMinimumDifference(TreeNode(1, null, TreeNode(5, TreeNode(3)))))
  println(getMinimumDifference(TreeNode(236,
    TreeNode(104, null, TreeNode(227)), TreeNode(781, null, TreeNode(981))))) //[236,104,701,null,227,null,911]
}
