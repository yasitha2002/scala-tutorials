package Demo

object labsheet4q1 {
  def main(args:Array[String])={
    val items = Array("erasers","books","pens","pencils","highlighters")
    val quantities = Array(30,25,50,62,15)

    def DisplayInventory(x:Array[String],y:Array[Int]):Unit={
      if(x.isEmpty && y.isEmpty){
        0
      }
      else{
        println(x.head+" : "+y.head)
        DisplayInventory(x.tail,y.tail)
      }
    }
    def restockItem(a:String,b:Int):Unit={
      var count:Int = 0;
      for(j <-0 to 4) {
        if (a == items(j)) {
          count+=1;
          quantities(j) += b
          println("new quantity of "+a+" is "+quantities(j))
        }
      }
      if (count==0){
        println(a+" Item does not exist")
      }
    }

    def sellItem(a:String,b:Int):Unit={
      var count:Int = 0
      for(j <-0 to 4) {
        if (a == items(j)) {
          count+=1;
          if(quantities(j)>=b) {
            quantities(j) -= b
            println("new quantity of " + a + " is " + quantities(j))
          }
          else{
            println("No enough quantity of "+a+" to sell")
          }
        }
      }
      if (count==0){
        println(a+" item does not exist")
      }
    }

    DisplayInventory(items,quantities)
    restockItem("books",10)
    sellItem("pens",60)

  }
}
