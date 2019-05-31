package com.liao.chapter06.method

/**
  * 方法案例快速入门
  */
object MethodDemo01 {
  def main(args: Array[String]): Unit = {
    val dog = new Dog
    println(dog.cal(1,2))
  }
}

class Dog {
  var age: Int = _
  var name: String = _

  //方法：
  def cal(n1: Int, n2: Int): Int = {
    return n1 + n2
  }
}
