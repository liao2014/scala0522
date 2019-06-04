package com.liao.chapter07.myextends

/**
  *类有一个主构器和任意数量的辅助构造器，而每个辅助构造器都必须先调用主构造器(也可以是间接调用)
  */
object ScalaBaseConstructor {
  def main(args: Array[String]): Unit = {
    /*无参数的 输出结果如下：
      Person4...
      Emp4 ....
     */
    var emp4 = new Emp4

    /*有参数的 输入结果如下：
      Person4...
      Emp4 ....
      Emp4 辅助构造器~
     */
    var emp5 = new Emp4("lisi")
  }
}

class Person4 {
  var name = "zhangsan"
  println("Person4...")
}

class Emp4 extends Person4 {
  println("Emp4 ....")

  def this(name: String) {
    this // 必须调用主构造器
    this.name = name
    println("Emp4 辅助构造器~")
  }
}

