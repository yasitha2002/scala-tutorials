package Demo

object labsheet2q3 {
 def main(args:Array[String]): Unit = {
     var ot_hours =30
     var normalw_hours =40


   def ot_salary():Int=85*ot_hours;
   def normal():Int=250*normalw_hours;
   def gross_salary()= ot_salary()+normal();
   def tax()=gross_salary()*0.12
   def take_home_salary()=gross_salary()-tax()
   println("Take home salary of the employee is rs."+take_home_salary())
 }
}
