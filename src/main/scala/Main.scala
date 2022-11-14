abstract class Mammal(val name: String)

trait Animal extends Mammal

abstract class Mother(val motherName: String) extends Mammal(motherName)

object Elephant extends Mother("marry") with Animal {}

object Main extends App {
  println(Elephant.name)
  println(Elephant.motherName)
}
