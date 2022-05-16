package com.leetcode.tree


object LeaderBoard_1244 extends App {


  class Leaderboard() {
    import scala.collection.mutable

    type Score = Int
    type PlayerId = Int
    type PlayerCount = Int

    val map = mutable.HashMap[PlayerId, Score]()
    val scoreToPlayersCount = mutable.TreeMap.empty[Score, PlayerCount](implicitly[Ordering[Int]].reverse)

    def addScore(playerId: Int, score: Int): Unit = {

      if (map.contains(playerId)) {
        val oldScore: Score = map.get(playerId).getOrElse(0)
        val newScore = oldScore + score
        map.update(playerId, newScore)
        //update tree
        incrementPlayerCount(newScore)
        //reduce count by 1 for old score
        removePlayerFromTree(oldScore)
      }
      else {
        map.put(playerId, score)
        incrementPlayerCount(score)
      }
    }

    private def removePlayerFromTree(oldScore: Score): Unit = {
      if (scoreToPlayersCount.get(oldScore).getOrElse(0) == 1) //if only 1 player
        scoreToPlayersCount.remove(oldScore)
      else scoreToPlayersCount.update(oldScore, scoreToPlayersCount(oldScore) - 1)
    }

    private def incrementPlayerCount(score: PlayerCount): Unit = {
      if (scoreToPlayersCount.contains(score))
        scoreToPlayersCount.update(score, scoreToPlayersCount(score) + 1)
      else scoreToPlayersCount.put(score, 1)
    }

    def top(K: Int): Int = {
      var counter = 0
      var totalSum = 0
      val scores = scoreToPlayersCount.take(K)
      for (entry <- scores if counter < K) {
        for (_ <- 0 until entry._2 if counter < K) {
          totalSum += entry._1
          counter += 1
        }
      }
      totalSum
    }

    def reset(playerId: Int) {
      map.get(playerId).map(score => resetPlayer(score, playerId))
    }

    def resetPlayer(score: Score, playerId: PlayerId): Unit = {
      map.remove(playerId)
      if (scoreToPlayersCount.getOrElse(score, 0) == 1)
        scoreToPlayersCount.remove(score)
      else scoreToPlayersCount.update(score, scoreToPlayersCount(score) - 1)
    }

  }

  /**
   * ["Leaderboard","addScore","addScore","addScore","addScore","addScore","addScore","addScore","addScore","addScore","addScore",
   * "top","reset","reset","addScore","addScore","top","reset","reset","addScore","reset"]
[[],[1,13],[2,93],[3,84],[4,6],[5,89],[6,31],[7,7],[8,1],[9,98],[10,42],[5],[1],[2],[3,76],[4,68],[1],[3],[4],[2,70],[2]]
   */
  val l = new Leaderboard()
  l.addScore(1,13)
  l.addScore(2,93)
  l.addScore(3,84)
  l.addScore(4,6)
  l.addScore(5,89)
  l.addScore(6,31)
  l.addScore(7,7)
  l.addScore(8,1)
  l.addScore(9,98)
  l.addScore(10,42)
  println(l.top(5))
  println(l.reset(1))
  println(l.reset(2))
  l.addScore(3,76)
  l.addScore(4,68)
  println(l.top(1))
  println(l.reset(3))
  println(l.reset(4))
  l.addScore(2 ,70)
  println(l.reset(2))


}
