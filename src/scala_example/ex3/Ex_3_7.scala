
// 반복문: 이중 for
package scala_example.ex3

object Ex_3_7 {
  def main(args: Array[String]): Unit = {
    for (x <- 1 to 5) {
      for (y <- 1 to 5) {
        print(x + "*" +y + "=" + x*y + "|"  )
      }
    }

  }
}