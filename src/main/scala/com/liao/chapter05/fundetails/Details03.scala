package com.liao.chapter05.fundetails

/** Scala语法中任何的语法结构都可以嵌套其他语法结构(灵活)，
  * 即：函数中可以再声明/定义函数，类中可以再声明类，
  * 方法中可以再声明/定义方法。
  */
object Details03 {
  def main(args: Array[String]): Unit = {
    def f1():Unit={
      println("f1.....")
    }
    println("ok...")
    hello()
  }
  def hello():Unit={
    println("hello")
    def hello1():Unit={//private final hello1$1()
      println("hello1")
    }
  }
}
