
// 반복문: 이중 for
object Ex_3_7 {
  def main(args: Array[String]): Unit = {
    for (x <- 1 to 5) {
      for (y <- 1 to 5) {
        print(x + "*" +y + "=" + x*y + "|"  )
      }
    }

  }
}