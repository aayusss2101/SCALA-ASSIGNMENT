package com.learn.scala

// Case class to store player information
case class Player(year: String,name:String,country:String,matches:Int,runs:Int,wickets:Int)

object Assignment2{

  /**
   * Populate with dummy player data
   * @return List of dummy players
   */
  def getPlayers():List[Player]={
    val players=List(
      Player("2020", "Virat Kohli", "India", 50, 2500, 0),
      Player("2020", "Steve Smith", "Australia", 45, 2100, 0),
      Player("2020", "Joe Root", "England", 55, 3000, 0),
      Player("2021", "Babar Azam", "Pakistan", 30, 1500, 0),
      Player("2021", "Kane Williamson", "New Zealand", 35, 1800, 0),
      Player("2021", "David Warner", "Australia", 20, 1100, 0),
      Player("2020", "Rohit Sharma", "India", 40, 1800, 0),
      Player("2021", "Eoin Morgan", "England", 25, 800, 0),
      Player("2020", "Faf du Plessis", "South Africa", 35, 1600, 0),
      Player("2021", "Shakib Al Hasan", "Bangladesh", 15, 500, 10),
      Player("2020", "Kagiso Rabada", "South Africa", 30, 0, 40),
      Player("2021", "Jasprit Bumrah", "India", 25, 0, 35),
      Player("2021", "Mitchell Starc", "Australia", 20, 0, 30),
      Player("2020", "Trent Boult", "New Zealand", 30, 0, 35),
      Player("2021", "Mohammad Amir", "Pakistan", 15, 0, 20)
    )
    players
  }

  /**
   * Sort list of players by the runs scored
   * @param players List of players
   * @return List of players in sorted order
   */
  def sortByRun(players:List[Player]):List[Player]={
    players.sortBy(- _.runs)
  }

  /**
   * Sort list of players by the wickets taken
   *
   * @param players List of players
   * @return List of players in sorted order
   */
  def sortByWicket(players:List[Player]):List[Player]={
    players.sortBy(- _.wickets)
  }

  /**
   * Sort list of players by the weightage of each player
   *
   * @param players List of players
   * @return List of players in sorted order
   */
  def sortByWeightage(players:List[Player]):List[Player]={
    players.sortBy(p=> - (p.wickets*5+p.runs*0.05))
  }

  def main(args: Array[String]): Unit = {

    // Get dummy data
    val players=getPlayers()
    // Sort players by run
    val playersByRun=sortByRun(players)
    // Sort players by wicket
    val playersByWicket=sortByWicket(players)
    // Sort players by weightage
    val playersByWeightage=sortByWeightage(players)
    println(s"Highest Scored Player: ${playersByRun(0)}")
    println
    println("Top 5 Players by Runs Scored")
    for(i<-0 until 5){
      println(playersByRun(i))
    }
    println
    println("Top 5 Players by Wickets Taken")
    for (i <- 0 until 5) {
      println(playersByWicket(i))
    }
    println
    println("Top 5 Players by Weightage")
    for (i <- 0 until 5) {
      println(playersByWeightage(i))
    }

  }
}