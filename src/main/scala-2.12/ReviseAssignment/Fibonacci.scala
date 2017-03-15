package ReviseAssignment
import scala.io.StdIn
import scala.io.StdIn.readInt
import scala.util.control.Breaks

/**
  * Created by Mmekut on 3/14/2017.
  */
object Fibonacci extends App {


  def nonTailRecursiveFibonacci (n:BigInt):BigInt =   {
    //if (n==0)  0
    //if(n==1)1
   // else {nonTailRecursiveFibonacci(n - 1) + nonTailRecursiveFibonacci(n - 2)}

    if (n == 1 || n == 0)
      n
    else { nonTailRecursiveFibonacci( n-1 ) + nonTailRecursiveFibonacci( n-2 )}

  }


  def tailRecursiveFibonacci(n:BigInt):BigInt={

    @scala.annotation.tailrec
    def tailHelper(num:BigInt,acc1:BigInt,acc2:BigInt):BigInt=
    {
      if (num==0)acc1
      else tailHelper(num-1,acc2,acc1+acc2)
    }
     tailHelper(n,0,1)
  }


println("Thanks, your Tail Recursive Fibonacci result: "+Fibonacci.tailRecursiveFibonacci(0))
  println("Thanks, your Tail Recursive Fibonacci result: "+Fibonacci.tailRecursiveFibonacci(1))
  println("Thanks, your Tail Recursive Fibonacci result: "+Fibonacci.tailRecursiveFibonacci(2))
  println("Thanks, your Tail Recursive Fibonacci result: "+Fibonacci.tailRecursiveFibonacci(3))
  println("Thanks, your Tail Recursive Fibonacci result: "+Fibonacci.tailRecursiveFibonacci(4))
  println("Thanks, your Tail Recursive Fibonacci result: "+Fibonacci.tailRecursiveFibonacci(5))
  println("Thanks, your Tail Recursive Fibonacci result: "+Fibonacci.tailRecursiveFibonacci(6))
  println("Thanks, your Tail Recursive Fibonacci result: "+Fibonacci.tailRecursiveFibonacci(7))
  println("Thanks, your Tail Recursive Fibonacci result: "+Fibonacci.tailRecursiveFibonacci(8))
  println("Thanks, your Tail Recursive Fibonacci result: "+Fibonacci.tailRecursiveFibonacci(100))
  println("Thanks, your Tail Recursive Fibonacci result: "+Fibonacci.tailRecursiveFibonacci(150))


 println()


  println("Thanks, your Non Tail Recursive Fibonacci result: "+Fibonacci.nonTailRecursiveFibonacci(0))
  println("Thanks, your Non Tail Recursive Fibonacci result: "+Fibonacci.nonTailRecursiveFibonacci(1))
  println("Thanks, your Non Tail Recursive Fibonacci result: "+Fibonacci.nonTailRecursiveFibonacci(2))
  println("Thanks, your Non Tail Recursive Fibonacci result: "+Fibonacci.nonTailRecursiveFibonacci(3))
  println("Thanks, your Non Tail Recursive Fibonacci result: "+Fibonacci.nonTailRecursiveFibonacci(4))
  println("Thanks, your Non Tail Recursive Fibonacci result: "+Fibonacci.nonTailRecursiveFibonacci(5))
  println("Thanks, your Non Tail Recursive Fibonacci result: "+Fibonacci.nonTailRecursiveFibonacci(6))
  println("Thanks, your Non Tail Recursive Fibonacci result: "+Fibonacci.nonTailRecursiveFibonacci(7))
  println("Thanks, your Non Tail Recursive Fibonacci result: "+Fibonacci.nonTailRecursiveFibonacci(8))
  println("Thanks, your Non Tail Recursive Fibonacci result: "+Fibonacci.nonTailRecursiveFibonacci(100))
  println("Thanks, your Non Tail Recursive Fibonacci result: "+Fibonacci.nonTailRecursiveFibonacci(150))

}
