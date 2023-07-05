package labsheet4

import scala.io.StdIn

object second {
  def main(args: Array[String]): Unit ={
    println("Enter a input value")
    var x= StdIn.readInt()
    println(matching(x))

  }

  def matching(x: Int): String = x match {
    case x if x <= 0 => "Negative/Zero"
    case x if x%2==0 => "Even number"
    case x if x%2!=0 => "Odd number"
  }

}
