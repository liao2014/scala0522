package com.liao.chapter06.constructor

/**
  * 示例：构造器调用顺序
  */
object Demo02 {
  def main(args: Array[String]): Unit = {
    //val a = new A
    /*下面的代码的输出顺序是：
    1、BBB 主构造器父类
    2、AAA 主构造器
    3、CCC 辅助构造器*/
    val a = new A("zhangsan")
  }
}

class B {
  println("BBB")
}

class A extends B() {
  println("AAA")

  def this(name: String) {
    this //这个this必须写
    println("CCC")
  }
}