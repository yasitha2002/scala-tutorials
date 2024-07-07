package Demo

object labsheet4q3 {
  def main(args:Array[String]):Unit={
    def toUpper(a:String):String={
      a.toUpperCase()
    }
    def toLower(a:String):String={
      a.toLowerCase()
    }
    def formatNames(name:String,hif:(String)=>String): String = {
      hif(name)
    }
    println(formatNames("Benny",toUpper))
    println(formatNames("Niroshan",toLower))
    println(formatNames("Saman",toLower))
    println(formatNames("Kumara",toLower))
  }
}
