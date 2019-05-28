package com.liao.chapter02.vars

object VarDemo2 {

  def main(args: Array[String]): Unit = {
    //类型推导
    var num = 1 //这个时候num就是Int类型
    //可以通过idea的提示来看，或者通过num.isInstanceOf[Int]来判断
    println(num.isInstanceOf[Int])
    //类型确定之后，就不能修改，说明Scala是强类型语言。
    //num = 2.3 //提示报错
  }
}
