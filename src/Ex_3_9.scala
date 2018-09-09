
// 반복문: 인덱스가 있는  for 문
object Ex_3_10 {
  def main(args: Array[String]): Unit = {
    var lists = List(1, 2, 3)
    for ((num, index) <- lists.zipWithIndex) {
      println(num)
      println(index)
    }
  }
}