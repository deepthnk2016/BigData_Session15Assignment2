/**
 * Author - Deepak Ray
 * Date - 08/05/2018
 * Description - BigData_Session15Assignment2 (question 2)
 *               Display multiple choice and default value
 */

object Session15Assignment2_2 {
  def main(args: Array[String]) {
    println(matchTest("Android"))
    println(matchTest("Big Data Development"))
    println(matchTest("Spark"))
    println(matchTest("Core Java"))
  }

  def matchTest(course: Any): Any = course match {
    case "Android"              => course + "-12999"
    case "Big Data Development" => course + "-17999"
    case "Spark"                => course + "-19999"
    case _                      => "Invalid Course"
  }
}
