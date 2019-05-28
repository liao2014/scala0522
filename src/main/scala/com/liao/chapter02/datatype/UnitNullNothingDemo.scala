package com.liao.chapter02.datatype

object UnitNullNothingDemo {

  def main(args: Array[String]): Unit = {

    val res1 = sayHello1()
    println("res1=" + res1)//结果是 res1=()
  }

  //Unit等价于java中中的void，只有一个实例值()
  def sayHello1(): Unit = {

  }


}
