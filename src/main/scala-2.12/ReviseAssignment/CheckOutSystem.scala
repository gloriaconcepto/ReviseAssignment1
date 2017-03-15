package ReviseAssignment

/**
  * Created by Mmekut on 3/15/2017.
  */
object CheckOutSystem extends App
{
  def Sum(items: List[String]): Int = {


    if(!items.contains("APPLE")&& ! items.contains("ORANGE") ) {
      println("Sorry we don't have that fruit in the list yet")
    }

    val applePrice: Int = 300

    val orangePrice: Int = 150

    val appleFilter = items.filter(_.startsWith("APPLE"))

    val orangeFilter = items.filter(_.startsWith("ORANGE"))
      appleFilter.size * applePrice + orangeFilter.size * orangePrice


  }


     val fruitItems1:List[String] =List("ORANGE","ORANGE","APPLE")
  val fruitItems2:List[String] =List("ORANGE","APPLE","APPLE")
  val fruitItems3:List[String] =List("APPLE","ORANGE")
  val fruitItems4:List[String] =List("ORANGE","ORANGE")
  val fruitItems5:List[String] =List("APPLE","APPLE")
  val fruitItems6:List[String] =List("MANGO","GRAPE","APPLE")
  val fruitItems7:List[String] =List("MANGO","GRAPE","ORANGE")
  val fruitItems8:List[String] =List("MANGO","GRAPE","GUAVA")

  println(s"The total cost for the fruit purchase is ₦ "+CheckOutSystem.Sum(fruitItems1))
  println()
  println()
  println(s"The total cost for the fruit purchase is ₦ "+CheckOutSystem.Sum(fruitItems2))
  println()
  println()
  println(s"The total cost for the fruit purchase is ₦ "+CheckOutSystem.Sum(fruitItems3))
  println()
  println()
  println(s"The total cost for the fruit purchase is ₦ "+CheckOutSystem.Sum(fruitItems4))
  println()
  println()
  println(s"The total cost for the fruit purchase is ₦ "+CheckOutSystem.Sum(fruitItems5))
  println()
  println()
  println(s"The total cost for the fruit purchase is ₦ "+CheckOutSystem.Sum(fruitItems6))
  println()
  println()
  println(s"The total cost for the fruit purchase is ₦ "+CheckOutSystem.Sum(fruitItems7))
  println()
  println()
  println(s"The total cost for the fruit purchase is ₦ "+CheckOutSystem.Sum(fruitItems8))



}
