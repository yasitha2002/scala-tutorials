package Demo

object labsheet8q1 {
  def main(args: Array[String]): Unit = {
    def encryption(word: String): String = {
      if (word.isEmpty) ""
      else {
        (word.head + 1).toChar + encryption(word.tail)
      }
    }
    def decryption(word: String): String = {
      if (word.isEmpty) ""
      else {
        (word.head - 1).toChar + decryption(word.tail)
      }
    }
    def cipher(fip:(String)=>String,a:String): Unit = {
      println(fip(a))
    }

    cipher(encryption,"rabbit")
    cipher(decryption,"sbccju")
  }
}
