package Labsheet08

object Question01 {
  val calculateInterest: Double => Double = {
    case amount if amount <= 20000 => amount * 0.02
    case amount if amount <= 200000 => amount * 0.04
    case amount if amount <= 2000000 => amount * 0.035
    case amount => amount * 0.065
  }

  def main(args: Array[String]): Unit = {
    val depositAmount = 250000 // You can change this value as needed
    val interest = calculateInterest(depositAmount)

    println(s"Deposit Amount: Rs. $depositAmount")
    println(s"Interest Earned: Rs. $interest")
  }

}
