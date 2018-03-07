object Partridge extends App {

  def part(args: Array[String]): String = {

    val keywords = List("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")

    args.count(keywords.contains(_)) match {
      case 0 => "Lynn, I've pierced my foot on a spike!!"
      case n => "Mines a Pint" + "!" * n
    }
  }
}
