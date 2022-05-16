package com.leetcode.easy

object ValidWordAbbr extends App {
  def validWordAbbreviation(word: String, abbr: String): Boolean = {
    var i = 0 // word index
    var j = 0 //abbr index

    var isMatch = true
    while (i < word.length && j < abbr.length && isMatch) {

      if (abbr.charAt(j).isDigit) {
        //its a digit
        val sb = new StringBuffer()
        while (j < abbr.length && abbr.charAt(j).isDigit) {
          sb.append(abbr.charAt(j).toString)
          j += 1
        }
        if(sb.charAt(0) == '0') isMatch = false
        else
        i += sb.toString.toInt
      }
      else if (word.charAt(i) == abbr.charAt(j)) {
        i += 1
        j += 1
      } else {
        isMatch = false
      }
    }
    if (i != word.length || j != abbr.length) isMatch = false
    println(isMatch)
    isMatch
  }

  validWordAbbreviation("internationalization", "i12iz4n") //true
  validWordAbbreviation("internationalization", "i13iz4n") //false
  validWordAbbreviation("apple", "a2e") //false
  validWordAbbreviation("apple", "ap3") //true

  validWordAbbreviation("apple", "5") //true
  validWordAbbreviation("apple", "applee") //false

  validWordAbbreviation("apple", "ap4") //false
  validWordAbbreviation("apple", "01apple") //false
}

