package com.liao.chapter06.constructor

/**
  * 示例：构造器--多辅助构造器
  */
object Demo03 {
  def main(args: Array[String]): Unit = {
    //var person = new Person2()
    var person = new Person2("zhangsan")
    person.showInfo()
  }
}

class Person2() {
  var name: String = _
  var age: Int = _

  def this(name: String) {
    //辅助构造器无论是直接或间接，最终都一定要调用主构造器，执行主构造器的逻辑
    //而且需要放在辅助构造器的第一行[这点和java一样，java中一个构造器要调用同类的其它构造器，也需要放在第一行]
    this() //直接调用主构造器
    this.name = name
  }

  def this(name: String, age: Int) {
    this() //直接调用主构造器
    this.name = name
    this.age = age
  }

  def this(age: Int) {
    this("匿名") //简介调用主构造器,因为 def this(name : String) 中调用了主构造器!
    this.age = age
  }

  def showInfo(): Unit = {
    println("person信息如下:")
    println("name=" + this.name)
    println("age=" + this.age)
  }
}
