package com.leetcode.easy

object Rearrange_Spaces_Between_Words_1592 extends App {

  def reorderSpaces(text: String): String = {
    val spaceCount = text.map(c => c).count(c => c == ' ')
    val words = text.split("\\W+").filter(s => s.trim != "")

    val balanced = if (words.length == 1) 0 else spaceCount / (words.length - 1)
    val extra = if (words.length == 1) spaceCount else spaceCount % (words.length - 1)
    buildText(words, balanced, extra)
  }

  def buildText(words: Seq[String], spaceInBetweenWords: Int, extraSpaceAtEnd: Int): String = {
    def spaces(count: Int, acc: String = ""): String = {
      if (count == 0) acc
      else
        spaces(count - 1, acc.concat(" "))
    }

    val addIn = spaces(spaceInBetweenWords)
    val addLast = spaces(extraSpaceAtEnd)
    val result = words.map(s => s.concat(addIn)).mkString("").dropRight(addIn.length).concat(addLast)
    result
  }

  reorderSpaces(" practice   makes   perfect")
  reorderSpaces("  this   is  a sentence ")
  reorderSpaces("  this   ")
  reorderSpaces("test")
  reorderSpaces("test1    ")
  reorderSpaces("    test1    ")
}
