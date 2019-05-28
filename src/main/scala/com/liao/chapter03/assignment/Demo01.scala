package com.liao.chapter03.assignment

/**
  * 赋值运算符的一些例子
  */
object Demo01 {

  def main(args: Array[String]): Unit = {
    var num = 2
    num <<= 2 //num=8
    num >>= 3 //num=4
    println("num=" + num)

    //在Scala中支持代码块
    val res = {
      if (num > 1) "大于1" else "不大于1"
    }
    println("res= " + res)
    //有两个变量，a和b，要求将其进行交换，但是不允许使用中间变量，最终打印结果
    var a = 1
    var b = 2
    a = a + b
    b = a - b
    a = a - b
    println("a: " + a)
    println("b: " + b)
  }
}
