package scala_example.ex4

object Ex_4_7 {
  def main(args: Array[String]): Unit = {
    val pig = new Pig2
    pig.eat
    pig.fly
    pig.shout
  }

  class Pig2 extends AnimalAb with Fly with Eat {
    def eat = println("음식을 먹다. 꿀꿀. ")
    def shout = println("쩝쩝")
  }

  abstract class AnimalAb {
    def shout
  }

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
  trait Eat {
    def eat
  }

}