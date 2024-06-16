package Demo

object labsheet1q4 {
 def main(args:Array[String])={
   def coverprice_cost(n:Int):Double=24.95*0.6*n ;
  def total_cost(num:Int,cpc:(Int)=>Double):Double = if(num<=50)num*3+cpc(num) else 3*50+(num-50)*0.75+cpc(num) ;
  println(total_cost(60,coverprice_cost))
 }
}
