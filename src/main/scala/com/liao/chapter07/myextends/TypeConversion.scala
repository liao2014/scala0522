package com.liao.chapter07.myextends

/**
  * Scala中类型检查和转换
  */
object TypeConversion {
  def main(args: Array[String]): Unit = {
    //classOf的使用，可以得到类名
    println(classOf[String])
    val s = "zhangsan"
    println(s.getClass.getName)

    //isInstanceOf和asInstanceOf
    var person2 = new Person2
    var emp2 = new Emp2
    //将子类引用给父类（向上转换，自动）
    person2 = emp2
    //将父类的引用重新转成子类引用（多态使用），也就是向下转型
    var emp3 = person2.asInstanceOf[Emp2]
    emp3.sayHello()
  }
}
class Person2 {
  var name: String = "zhangsan"

  def printName() {
    println("Person printName() " + name)
  }
}

class Emp2 extends Person2 {
  //这里需要显示的使用override
  override def printName() {
    println("Emp printName() " + name)
    //在子类中需要调用父类的方法，使用super
    super.printName()
  }
  def sayHello(): Unit ={
    println("Emp2中的sayHello()....")
  }
}