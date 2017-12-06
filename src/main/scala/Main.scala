
object Main {
  def main(args: Array[String]) = {
    val (cmd, ints) = args.toList match {
      case cmdName :: strs =>
        (cmdName, strs.map(_.toInt))
      case _ =>
        throw new RuntimeException("Do better")
    }

    cmd match {
      case "sum" =>
        println(sum(ints))
      case "contains" =>
        val search = ints.head
        println(contains(search, ints.tail))
    }
  }

  def sum(ints: List[Int]): Int = {
    ints.sum
  }

  def contains(search: Int, ints: List[Int]): Boolean = {
    ints.contains(search)
  }

  def first(ints: List[Int]): Option[Int] = {
    ints.headOption
  }
}
