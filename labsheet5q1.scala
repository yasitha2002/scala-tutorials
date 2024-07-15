package Demo

object labsheet5q1 {
  def main(args: Array[String]): Unit = {
    println("Enter product names (Type 'done' to finish):")
    val list = getProductList()
    printProductList(list, 1)
    getTotalProducts(list, 0)
  }

  def getProductList(): List[String] = {
    var ui = ""
    var products: List[String] = List()

    while (ui != "done") {
      ui = scala.io.StdIn.readLine().trim
      if (ui != "done" && ui.nonEmpty) {
        products = products :+ ui
      }
    }
    products
  }

  def printProductList(a: List[String], count: Int): Unit = {
    if (a.nonEmpty) {
      println(s"$count. ${a.head}")
      printProductList(a.tail, count + 1)
    }
  }

  def getTotalProducts(a: List[String], index: Int): Unit = {
    if (a.nonEmpty) {
      var x = index + 1
      getTotalProducts(a.tail, x)
    }
    else {
      println("Total number of products = " + index)
    }
  }
}
