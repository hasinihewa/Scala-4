package labsheet4

import scala.io.StdIn

object first {
    def main(args: Array[String]): Unit = {
      println("Enter the value of deposite:")
      var m = StdIn.readInt()
      println("Your full amount  is: " + interest(m))
    }


    def interest(x: Int): Double = x match {
      case x if x <= 20000 => x * 102 / 100
      case x if x <= 200000 => x * 104 / 100
      case x if x <= 2000000 => x * 103.5 / 100
      case x if x > 2000000 => x * 106.5 / 100


    }

  }


