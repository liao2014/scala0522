package com.liao.chapter05

/**
  * 方法转成函数实例
  */
object Method2Function {

  def main(args: Array[String]): Unit = {
    val dog = new Dog
    println(dog.sum(1, 2))
    //方法转成函数
    val f1 = dog.sum _
    println("f1= " + f1)
    println("f1= " + f1(3, 4))

    //直接定义一个函数
    val f2 = (x: Int, y: Int) => {
      x + y
    }
    println("f2= " + f2)
    println("f2= " + f2(7,8))
  }
}

class Dog {
  //下面定义一个方法
  def sum(x: Int, y: Int): Int = {
    x + y
  }
}
