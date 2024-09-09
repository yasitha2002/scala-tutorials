package Demo
object labsheet10q1 {

  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator cannot be zero")

    private val g = gcd(n.abs, d.abs)
    val numerator: Int = n / g
    val denominator: Int = d / g

    def this(n: Int) = this(n, 1)

    override def toString: String = s"$numerator/$denominator"

    def neg: Rational = new Rational(-numerator, denominator)

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  }

   def main(args:Array[String]): Unit = {
    val x = new Rational(3, 4)
    val negX = x.neg
    println(negX)
  }
}