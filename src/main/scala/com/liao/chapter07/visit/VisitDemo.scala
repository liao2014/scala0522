package com.liao.chapter07.visit

/**
  * 可见性示例，其中有牵涉到伴生类和伴生对象的问题。
  */
object VisitDemo {
  def main(args: Array[String]): Unit = {
    val c = new Person()
    c.showInfo()
    Person.test(c)
  }
}
//当一个文件中出现了class Person和object Person
//1、class Person称之为伴生类
//2、object Person称之为伴生对象
//3、Scala设计者将static拿掉，设计了伴生类和伴生对象的概念
//4、伴生类写非静态的内容，伴生对象是静态内容。
class Person {
  var name: String = "jack"
  private var sal: Double = 20000.4

  def showInfo(): Unit = {
    println(" name " + name + " sal= " + sal)
  }
}

object Person {
  def test(c: Person): Unit = {
    //这里体现出在伴生对象中，可以访问c.sal
    println("test() name=" + c.name + " sal= " + c.sal)
  }
}
