package Demo

object labsheet10q2 {
  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator cannot be zero")
    private val g = gcd(n.abs, d.abs)
    val numerator: Int = n / g
    val denominator: Int = d / g

    def this(n: Int) = this(n, 1)

    override def toString: String = s"$numerator/$denominator"

    def neg: Rational = new Rational(-numerator, denominator)

    def sub(that: Rational): Rational = {
      val newNumerator = this.numerator * that.denominator - that.numerator * this.denominator
      val newDenominator = this.denominator * that.denominator
      new Rational(newNumerator, newDenominator)
    }

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  }

  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    val result = x.sub(y).sub(z) // x - y - z
    println(result)
  }
}