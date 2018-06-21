/**
 * Author - Deepak Ray
 * Date - 08/05/2018
 * Description - BigData_Session15Assignment2 (question 1)
 *               Program to demonstrator partial function
 */

import java.util.Scanner;
object Session15Assignment2_1 {
  //function for perform square of passed number
  def calSquare(x:Int) = x*x
  
  //function to add two numbers which are passed and a constant 5 will get added to it
  val sumnumbers: PartialFunction[Int, Int] = {

    case x: Int if x >= 0 => x + 5
  }
  def main(args: Array[String]) {
    var scan: Scanner = new Scanner(System.in);
    //Accept first number
    print("Enter first number:");
    var firstNumber: Int = scan.nextInt();

    //Accept Second Number
    print("Enter Second Number:");
    var secondNumber: Int = scan.nextInt();

    //Call the sumnumbers function to perform addition and this will be input to calcsquare method.
    println(calSquare(sumnumbers(firstNumber + secondNumber)))
    scan.close()
  }
}

