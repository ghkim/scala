

package scala_example.ex3

object Ex_3_6 {
  def main(args: Array[String]): Unit = {
    var a = 0
    do{
      printf(a + ",")
      a += 1
    } while (a < 20) 
  }
}