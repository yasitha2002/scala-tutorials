package Demo

object labsheet1q5 {
  def main(args: Array[String]) = {
    val easy_pace_time = (d: Int) => d * 8;
    val tempo_pace_time = (d: Int) => d * 7;
    val Total_time = (de: Int, dt: Int, easy: (Int) => Int, tempo: (Int) => Int) => println(easy(de) + tempo(dt));
    Total_time(2, 3, easy_pace_time, tempo_pace_time);
  }
}
