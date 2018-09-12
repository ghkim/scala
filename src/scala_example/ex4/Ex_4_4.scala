

package scala_example.ex4

object Ex_4_4 {
  def main(args: Array[String]): Unit = {
    val user = new PaidUser("김경환", 10, 'M' , 100000000)
    user.sayName
    user.showMoney
  }
}

class User(name: String, age: Int, sex: Char) {
  val sayName = println("제 이름은 " + name)
}

class PaidUser(name: String, age: Int, sex: Char, money: Int) extends User(name, age, sex) {
  val showMoney = println(money + "원이 있습니다.")
}