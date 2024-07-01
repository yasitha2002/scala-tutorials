package Demo

object labsheet3q3 {
  def main(args: Array[String]): Unit = {
    def mean(a:Int,b:Int):Float={
      val avg:Float = (a+b)/2 .toFloat
      avg ;
    }
    val result = mean(31,20)
    println(f"$result%.2f")
  }
}
