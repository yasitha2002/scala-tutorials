package Demo

object labsheet6q1 {
  def main(args: Array[String]): Unit = {

    var inventory1: Map[Int, (String, Int, Double)] = Map(
      101 -> ("ProductA", 10, 20.5),
      102 -> ("ProductB", 5, 30.0),
      103 -> ("ProductC", 20, 15.0)
    )

    var inventory2: Map[Int, (String, Int, Double)] = Map(
      102 -> ("ProductB", 10, 28.0),
      104 -> ("ProductD", 7, 50.0)
    )


    def getProductNames(inventory: Map[Int, (String, Int, Double)]): List[String] = {
      inventory.values.map(_._1).toList
    }


    def calculateTotalValue(inventory: Map[Int, (String, Int, Double)]): Double = {
      inventory.values.map { case (_, quantity, price) => quantity * price }.sum
    }


    def isInventoryEmpty(inventory: Map[Int, (String, Int, Double)]): Boolean = {
      inventory.isEmpty
    }


    def mergeInventories(inventory1: Map[Int, (String, Int, Double)],inventory2: Map[Int, (String, Int, Double)]): Map[Int, (String, Int, Double)] = {
      (inventory1.keySet ++ inventory2.keySet).map { id =>
        val item1 = inventory1.getOrElse(id, ("", 0, 0.0))
        val item2 = inventory2.getOrElse(id, ("", 0, 0.0))
        val name = if (item1._1.nonEmpty) item1._1 else item2._1
        val quantity = item1._2 + item2._2
        val price = math.max(item1._3, item2._3)
        id -> (name, quantity, price)
      }.toMap
    }



    def checkProductExists(inventory: Map[Int, (String, Int, Double)], productId: Int): Unit = {
      inventory.get(productId) match {
        case Some((name, quantity, price)) =>
          println(s"Product ID: $productId, Name: $name, Quantity: $quantity, Price: $price")
        case None =>
          println(s"Product with ID: $productId does not exist in the inventory.")
      }
    }

    println("Product Names in Inventory1: " + getProductNames(inventory1))
    println("Total Value of Inventory1: " + calculateTotalValue(inventory1))
    println("Is Inventory1 Empty: " + isInventoryEmpty(inventory1))

    val mergedInventory = mergeInventories(inventory1, inventory2)
    println("Merged Inventory: " + mergedInventory)

    println("Check Product with ID 102 in Inventory1:")
    checkProductExists(inventory1, 102)
  }
  }
