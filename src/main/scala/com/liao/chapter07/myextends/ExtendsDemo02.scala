package com.liao.chapter07.myextends

/**
  * 子类继承了所有的属性，只是私有的属性不能直接访问，需要通过公共的方法去访问
  */
object ExtendsDemo02 {
  def main(args: Array[String]): Unit = {
    val sub = new Sub()
    println(sub.n1)
    sub.sayOk()
  }
}

class Base {
  var n1: Int = 1
  protected var n2: Int = 2
  private var n3: Int = 3

  def baseTest1(): Unit = {
    println("baseTest 1")
  }

  protected def baseTest2(): Unit = {
    println("baseTest 2")
  }

  private def baseTest3(): Unit = {
    println("baseTest 3")
  }
}

class Sub extends Base {
  def sayOk(): Unit = {
    this.n1 = 20
    this.n2 = 40
    println("范围" + this.n1 +"--" + this.n2)
  }
}
