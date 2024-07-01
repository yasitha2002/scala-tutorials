package Demo

object labsheet3q1 {
  def main(args: Array[String]): Unit = {

    def reverse_string(str:String):String={
      if(str.isEmpty) {
        ""
      }
      else {
        reverse_string(str.tail)+str.head
      }
    }

    val result = reverse_string("car")
    println(result)
  }
  }

