package Demo

object labsheet3q2 {
  def main(args: Array[String]): Unit = {

    // Function to filter strings longer than 5 characters
    def long_strings(mylist: List[String]): List[String] = {
      if (mylist.isEmpty) {
        List()
      }
      else {
        val str = mylist.head;
        if (str.length > 5) {
          str :: long_strings(mylist.tail)
        }
        else {
          long_strings(mylist.tail)
        }
      }
    }


    val list1: List[String] = List("hello", "vehicle", "yellow", "car","school")
    val filteredList = long_strings(list1)
    println(s"Original List: $list1")
    println(s"Filtered List: $filteredList")
  }
}
