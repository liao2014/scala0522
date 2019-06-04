package com.liao.chapter07.myextends

/**
  * 继承快速入门示例
  */
object ExtendsDemo01 {
  def main(args: Array[String]): Unit = {
    val student = new Student
    student.name = "zhangsan" //实际调用了student.name()方法，调动从Person继承的name()
    student.study()
    student.show()
  }
}

class Person {
  var name: String = _
  var age: Int = _

  def show(): Unit = {
    println("学生信息如下：")
    println("姓名： " + this.name)
  }
}

//定义一个Student子类继承Person父类
class Student extends Person {
  def study(): Unit = {
    //这里可以使用父类的属性或方法
    println(this.name + "学习Scala")
  }
}
