package Demo

object labsheet7q1 {
  def main(args: Array[String]): Unit = {

    var l = List(1, 2, 3, 4, 5, 6, 7, 8, 9,11,25,23)

    def filterEvenNumbers(numbers: List[Int]): List[Int] = {
      numbers.filter(num => num % 2 == 0)
    }

    println(filterEvenNumbers(l))

    def calculateSquare(numbers: List[Int]): List[Int] = {
      numbers.map(num => num * num)
    }

    println(calculateSquare(l))


    def prime(p: Int, n: Int = 2): Boolean = {
      if (p <= 1) false
      else if (p == n) true
      else if (p % n == 0) false
      else if (n * n > p) true
      else prime(p, n + 1)
    }

    def filterPrime(nums: List[Int]): List[Int] = {
      nums.filter(num => prime(num))
    }
    println(filterPrime(l))
  }


}