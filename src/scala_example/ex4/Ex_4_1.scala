

package scala_example.ex4

object Ex_4_1 {
  def main(args: Array[String]): Unit = {
    val cal = new Vehice();
    println(cal.hood)
    println(cal.price)
  }
}

class Vehice(){
  var price: Int = 1000
  var hood: String = "expensive hood"
}