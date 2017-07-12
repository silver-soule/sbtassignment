package edu.knoldus

import org.scalatest.FunSuite
/**
  * Created by gitika on 12/7/17.
  */

class CalculatorTestSuite extends FunSuite{
  final val NUM1 = 3
  final val NUM2 = 4
  final val NUM3 = 0
  final val NUM4 = 12
  final val NUM5 = -5

  test("add two numbers"){
    assert(new Calculator().add(NUM1,NUM2) == 7)
  }

  test("subtract two numbers"){
    assert(new Calculator().subtract(NUM1,NUM2) == -1)
    assert(new Calculator().subtract(NUM4,NUM2) == 8)
  }

  test("multiply two numbers"){
    assert(new Calculator().multiply(NUM1,NUM2) == 12)
  }

  test("divide two numbers"){
    assert(new Calculator().divide(NUM4,NUM2) == 3.toDouble )
    assert(new Calculator().divide(NUM1,NUM2) == 3/(4.toDouble))
  }

  test("dividing numbers by 0"){
    intercept[java.lang.IllegalArgumentException] {
      new Calculator().divide(NUM1, NUM3)
    }
  }

  test("raise a number to power"){
    assert(new Calculator().power(NUM1,NUM2) == 81.toDouble)
    assert(new Calculator().power(NUM1,NUM5)== scala.math.pow(NUM1,NUM5))
  }

  test("find modulus of 2 numbers"){
    assert(new Calculator().modulus(NUM1,NUM2) == 3)
    assert(new Calculator().modulus(NUM5,NUM1) == -2)
  }

  test("modulus with zero"){
    intercept[java.lang.IllegalArgumentException] {
      new Calculator().modulus(NUM1, NUM3)
    }
  }

  test("find absolute of a number"){
    assert(new Calculator().absolute(NUM5)==5)
    assert(new Calculator().absolute(NUM1)==NUM1)
  }

  test("find max of 2 numbers"){
    assert(new Calculator().max(NUM4,NUM1)==NUM4)
    assert(new Calculator().max(NUM1,NUM4)==NUM4)
  }

  test("find min of 2 numbers"){
    assert(new Calculator().min(NUM4,NUM1)==NUM1)
    assert(new Calculator().min(NUM1,NUM4)==NUM1)

  }

}
