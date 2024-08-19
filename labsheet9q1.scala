package Demo
object labsheet9q1 {

  def actualInterest(dep:Double,fip:(Double)=>Boolean):Boolean={
    fip(dep)
  }

  def calculateInterest(deposit: Double): Double = {
    val interest: Double = deposit match {
      case d if (actualInterest(d,(d)=>if (d <= 20000) true else false))    => d * 0.02
      case d if (actualInterest(d,(d)=>if (d <= 200000) true else false))   => d * 0.04
      case d if (actualInterest(d,(d)=>if (d <= 2000000) true else false))  => d * 0.035
      case d if (actualInterest(d,(d)=>if (d > 2000000) true else false))   => d * 0.065
    }
    interest;
  }

  def main(args: Array[String]): Unit = {
    val deposit = 2500000.0
    val interestAmount = calculateInterest(deposit)
    println(s"The interest on a deposit of Rs. $deposit is Rs. $interestAmount")
  }

}