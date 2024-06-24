package Demo

object labsheet2q4 {
  def main(args:Array[String]): Unit = {
    def attendance(price: Double): Int = {
      120 + ((15.0 - price) / 5.0 * 20).toInt
    }

    def cost(attendees: Int): Double = {
      500 + (3 * attendees)
    }

    def revenue(price: Double, attendees: Int): Double = {
      price * attendees
    }

    def profit(price: Double): Double = {
      val attendees = attendance(price)
      revenue(price, attendees) - cost(attendees)
    }

    def findOptimalPrice(): Double = {
      var maxProfit = 0.0
      var optimalPrice = 0.0


      for (price <- 0 to 100 ) {
        val currentProfit = profit(price)

        if (currentProfit > maxProfit) {
          maxProfit = currentProfit
          optimalPrice = price
        }
      }

      optimalPrice
    }
println("Best ticket price is "+findOptimalPrice())

  }
}
