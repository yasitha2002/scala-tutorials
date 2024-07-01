package Demo

object labsheet3q4 {
  def main(args: Array[String]): Unit = {
    object SumEvenNumbers {
      def main(args: Array[String]): Unit = {
        def sumEvenNumbers(numbers: List[Int]): Int = {
          if (numbers.isEmpty) {
            0
          } else {
            val head = numbers.head
            val tail = numbers.tail
            if (head % 2 == 0) head + sumEvenNumbers(tail)
            else sumEvenNumbers(tail)
          }
        }


        val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val result = sumEvenNumbers(list)
        println(s"The sum of even numbers in the list is: $result")
      }
    }


  }
}
