package com.liao.chapter07.myextends

/**
  * 抽象类快速入门
  */
object AbstractDemo01 {
  def main(args: Array[String]): Unit = {
    println("ok ")
  }
}

abstract class Animal {
  var name: String //抽象的字段
  var age: Int // 抽象的字段
  var color: String = "black"

  //这个父类的方法，被子类继承后，没有什么用处，但是我们还
  //希望子类将来必须有这个cry方法,但是目前cry 不用写，声明为抽象的方法
  def cry()
}
