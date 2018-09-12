package scala_example.ex4

object Ex_4_5 {
  def main(args: Array[String]): Unit = {
    val flyingwhale = new Animal
    flyingwhale.fly
    flyingwhale.swimming

  }

  class Animal extends Fly with Swimming

  /**
   * @author gimgyeonghwan
   */
  trait Fly {
    def fly = println("하늘을 날다. 휘리릭 ~ ")
  }
  /**
   * @author gimgyeonghwan
   */
  trait Swimming {
    def swimming = println("수영을 하다. 촤아아 ~ ")
  }
  /**
   * @author gimgyeonghwan
   */
  trait Running {
    def running = println("달리다. 슝슝 ~ ")
  }
  /**
   * @author gimgyeonghwan
   */
  trait eat {
    def eat
  }

}