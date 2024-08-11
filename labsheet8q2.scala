package Demo

object labsheet8q2 {

  val threeMultiples = (a:Int)=>if(a%3==0) true else false;
  val fiveMultiples = (a:Int)=>if(a%5==0) true else false;
  val threeFiveMultiples = (a:Int)=>if(a%3==0 && a%5==0) true else false;

  def main(args: Array[String]): Unit = {
    println("Enter an integer :")
    val num = scala.io.StdIn.readLine().toInt
    num match{
      case x if(threeFiveMultiples(x))=>println("Multiple of Both Three and Five");
      case x if(threeMultiples(x))=>println("Multiple of Three");
      case x if(fiveMultiples(x))=>println("Multiple of Five");
      case _ =>println("Not a Multiple of Three or Five")
    }


  }
}
