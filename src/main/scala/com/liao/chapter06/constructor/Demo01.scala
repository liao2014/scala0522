package com.liao.chapter06.constructor

/**
  * 构造器快速入门
  */
object Demo01 {
  def main(args: Array[String]): Unit = {
    /*val p1 = new Person("zhangsan", 20)
    println(p1)*/
    //println(p1.toString)
    val p2 = new Person("zhangsan")
    println(p2)
  }

}

//创建Person对象的同时初始化对象的age属性值和name属性值
class Person(inName: String, inAge: Int) {
  var name: String = inName
  var age: Int = inAge
  age += 20
  println("======")

  override def toString: String = {
    "name=" + this.name + " age=" + this.age
  }

  println(age)

  //辅助构造器，多个构造器类似于java中的重载，因为都是使用this，只是参数不一样
  def this(name: String) {
    //辅助构造器，必须在第一行显示调用主构造器。
    this("lisi", 10)
    this.name = name
  }
}