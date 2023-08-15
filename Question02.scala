package Labsheet08

object Question02 {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide a single integer argument.")
      System.exit(1)
    }

    val input = args(0).toInt

    val categorizeNumber: Int => String = {
      case n if n < 0 => "Negative"
      case 0 => "Zero"
      case n if n % 2 == 0 => "Even number"
      case _ => "Odd number"
    }

    val category = categorizeNumber(input)
    println(s"Input: $input")
    println(s"Categorized as: $category")
  }

}
