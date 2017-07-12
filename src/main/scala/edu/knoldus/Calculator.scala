package edu.knoldus


class Calculator {

  def add(num1:Int,num2:Int)  : Int  = num1 + num2

  def subtract(num1:Int,num2:Int) : Int =  num1-num2

  def multiply(num1:Int,num2:Int) : Int = num1*num2

  def divide(num:Int,den:Int) : Double = {
    require(den!=0)
    num.toDouble/den
  }

def power(base:Int,exponent:Int)  : Double = {
  def recursivePower(acc: Double, base: Int, exponent: Int): Double = {
    if (exponent == 0) {
      acc
    }
    else {
      recursivePower(acc * base, base, exponent - 1)
    }
  }
  val op = recursivePower(1.toDouble,base,scala.math.abs(exponent))
  if(exponent<0) 1/op else op
}

  def modulus(num1:Int,num2:Int)  : Int =  {
    require(num2!=0)
    num1%num2
  }

  def absolute(num:Int) : Int = if(num<0) (-1)*num else num

  def max(num1:Int,num2:Int)  : Int = if(num1>num2) num1  else  num2

  def min(num1:Int,num2:Int)  : Int = if(num1<num2) num1  else  num2


}
