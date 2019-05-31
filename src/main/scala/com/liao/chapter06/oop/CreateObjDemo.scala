package com.liao.chapter06.oop

/**
  * 创建并引用对象示例
  */
object CreateObjDemo {
  def main(args: Array[String]): Unit = {
    val person = new Person
    //将子类对象交给父类的引用，则必须加上类型
    val person2:Person = new Person1
  }
}
class Person{

}
class Person1 extends Person{

}
