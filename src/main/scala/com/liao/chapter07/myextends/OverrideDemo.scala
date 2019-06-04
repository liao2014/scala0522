package com.liao.chapter07.myextends

/**
  * 子类继承父类，重写父类中的方法示例
  */
object OverrideDemo {
  def main(args: Array[String]): Unit = {
    val emp = new Emp()
    emp.printName()
  }
}

class Person1 {
  var name: String = "zhangsan"

  def printName() {
    println("Person printName() " + name)
  }
}

class Emp extends Person1 {
  //这里需要显示的使用override
  override def printName() {
    println("Emp printName() " + name)
    super.printName()
  }
}