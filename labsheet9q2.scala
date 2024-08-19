package Demo

object labsheet9q2 {
  def main(args:Array[String]):Unit={

    val IsEven = (num:Int)=>if (num%2==0) true else false ;
    val IsOdd = (num:Int)=>if (num%2!=0) true else false ;
    val IsNegativeOrZero = (num:Int)=>if (num <= 0) true else false ;

    println("Enter the integer:")
    var a = scala.io.StdIn.readLine().toInt ;
    a match{
      case x if(IsNegativeOrZero(x)) => println("Negative/Zero is input");
      case x if(IsEven(x)) => println("Even number is given");
      case x if(IsOdd(x)) => println("Odd number is given");
    }
  }
}
