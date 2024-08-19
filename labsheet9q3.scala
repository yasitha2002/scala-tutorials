package Demo

object labsheet9q3 {

  def toUpper(name: String): String = name.toUpperCase

  def toLower(name: String): String = name.toLowerCase

  def formatNames(name: String,format: String => String): String = format(name)

  def main(args: Array[String]): Unit = {

    println(formatNames("Benny",toUpper))
    println(formatNames("Niroshan",name => {
      val firstPart = name.substring(0, 2).toUpperCase
      val secondPart = name.substring(2).toLowerCase
      firstPart + secondPart
    }))
    println(formatNames("Saman",toLower))
    println(formatNames("Kumara",name => {
      val firstPart = name.substring(0, 1).toUpperCase
      val secondPart = name.substring(1, 5).toLowerCase
      val lastPart = name.substring(5).toUpperCase
      firstPart + secondPart + lastPart
    }))
  }
}
