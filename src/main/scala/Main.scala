import cats.implicits._
import cats.kernel.Semigroup

object Main extends App {
  println("Hello, World!")

  println("Semigroup combine")
  println(s"  combine(1, 2): ${Semigroup[Int].combine(1, 2)}")
  println(s"  combine(List(1, 2, 3), List(4, 5, 6)): ${Semigroup[List[Int]].combine(List(1, 2, 3), List(4, 5, 6))}")
  println(s"  combine(Option(1), Option(2)): ${Semigroup[Option[Int]].combine(Option(1), Option(2))}")
  println(s"  combine(Option(1), None): ${Semigroup[Option[Int]].combine(Option(1), None)}")

  println(s"  combine(_ + 1, _ * 10).apply(6): ${Semigroup[Int => Int].combine(_ + 1, _ * 10).apply(6)}")
//  println(s"  : ${}")
}
