package Demo

object labsheet4q2 {
  def main(args:Array[String])={
    println("Enter your input : ")
    var a = scala.io.StdIn.readLine().toInt
   a match{
      case x if (x <= 0) => println("Negative/Zero is input");
      case x if(x%2==0) => println(" Even number is given");
      case _ => println("Odd number is given");
    }
  }

}
