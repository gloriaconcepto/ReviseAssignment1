package ReviseAssignment
import scala.io.StdIn
import scala.io.StdIn.readInt
import scala.util.control.Breaks

/**
  * Created by Mmekut on 3/14/2017.
  */
object Factorial extends  App{

  def nonTailRecursiveFactorial(n: BigInt): BigInt = {
    if (n == 0) 1

    else
      n * (n - 1)
  }


  def tailRecursiveFactorial(num: BigInt): BigInt =
  {
    @scala.annotation.tailrec
    def tailRecursiveFactorialHelper(number: BigInt, acc: BigInt): BigInt = {
      if (number == 0) acc
      else
        tailRecursiveFactorialHelper(number - 1, acc * number)
    }
    tailRecursiveFactorialHelper(num, 1)
}
  println("Thanks, the results is: " + Factorial.nonTailRecursiveFactorial(1))
  println("Thanks, the results is: " + Factorial.nonTailRecursiveFactorial(2))
  println("Thanks, the results is: " + Factorial.nonTailRecursiveFactorial(6))
  println("Thanks, the results is: " + Factorial.nonTailRecursiveFactorial(24))
  println("Thanks, the results is: " + Factorial.nonTailRecursiveFactorial(50))
  println("Thanks, the results is: " + Factorial.nonTailRecursiveFactorial(80))
  println("Thanks, the results is: " + Factorial.nonTailRecursiveFactorial(1000))
  println("Thanks, the results is: " + Factorial.nonTailRecursiveFactorial(1500))


  println("Thanks, the results  for tail recursive method is: " + Factorial.tailRecursiveFactorial(1))
  println("Thanks, the results for tail recursive method is: " + Factorial.tailRecursiveFactorial(2))
  println("Thanks, the results for tail recursive method is: " + Factorial.tailRecursiveFactorial(6))
  println("Thanks, the results for tail recursive method is: " + Factorial.tailRecursiveFactorial(24))
  println("Thanks, the results for tail recursive method is: " + Factorial.tailRecursiveFactorial(50))
  println("Thanks, the results for tail recursive method is: " + Factorial.tailRecursiveFactorial(80))
  println("Thanks, the results for tail recursive method is: " + Factorial.tailRecursiveFactorial(1000))
  println("Thanks, the results for tail recursive method is: " + Factorial.tailRecursiveFactorial(1500))




}
