package io.turntabl.scalagettingstarted

object MyApp extends App {
  val firstname = "Patricia"
  val town = "Kwahu Abetifi"
  println(s"My name is $firstname, and i come from $town")

  def threeTimes(i: String) = i * 3
  println(threeTimes("we"))

  def even(num: Int) = if(num % 2 == 0) print("even")
 println(even(3))

  def wordsToLower(words: String*) = words map(_.toLowerCase)
 wordsToLower("TabiA", "MaLLam", "TarKoSt")

  def even2(num: Int)= num % 2 match{
   case 0 => true
   case 1 => false
  }
  even2(3)

 def isWeekendDay(oneday: String) =
  oneday match {
   case "Saturday" | "Sunday" => true
   case _ => false
  }

 def areWeekendDays(days: String*) = days map (justday => isWeekendDay(justday))

 areWeekendDays("Monday", "Saturday") foreach println

 def stringPrint(s: String, i: Int) = s * i
 println(stringPrint("Malam", 4))
}

