package Labsheet08

object Question03 {
  def toUpper(input: String): String = input.toUpperCase

  def toLower(input: String): String = input.toLowerCase

  def formatNames(name: String)(formatter: String => String): String = formatter(name)

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    val upperFormattedNames = names.map(formatNames(_)(toUpper))
    val lowerFormattedNames = names.map(formatNames(_)(toLower))

    println("Original Names:")
    names.foreach(println)

    println("\nFormatted Names (Upper Case):")
    upperFormattedNames.foreach(println)

    println("\nFormatted Names (Lower Case):")
    lowerFormattedNames.foreach(println)
  }

}
