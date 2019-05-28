package com.liao.chapter02.vars

object VarDemo1 {

  def main(args: Array[String]): Unit = {
    var a: Int = 1 //定义一个整型变量,取名a,并赋初值1
    var b: Int = 2 //定义一个整型变量,取名b,并赋初值2
    b = 3 //给变量b 赋 3
    println("a=" + a) //输出语句,把变量a的值输出
    println("b=" + b) //把变量b的值输出
  }
}
