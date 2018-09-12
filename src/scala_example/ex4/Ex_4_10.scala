package scala_example.ex4

object Ex_4_10 {
  def main(args: Array[String]): Unit = {
    val pig = new Mazingga
    printf(pig.shoot)
  }

  class Mazingga extends Robot with m16 with Bazooka with Deapodong{
    override def shoot = "마징가다 ~ ~ ~ "
  }

  abstract class Robot {
    def shoot = "아엠 로봇 "
  }

  /**
   * @author gimgyeonghwan
   */
  trait m16 extends Robot{
    override def shoot = super.shoot + "따따따따따다. "
  }
  /**
   * @author gimgyeonghwan
   */
  trait Bazooka extends Robot{
    override def shoot = super.shoot + "쾅~ "
  }
  /**
   * @author gimgyeonghwan
   */
  trait Deapodong extends Robot{
    override def shoot = super.shoot + "콰르르릉 ~ "
  }

}