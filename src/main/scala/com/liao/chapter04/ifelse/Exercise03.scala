package com.liao.chapter04.ifelse
import scala.math._
/**
  * 求ax2+bx+c=0方程的根。a,b,c分别为函数的参数，如果：b2-4ac>0，则有两个解；
  * b2-4ac=0，则有一个解；b2-4ac<0，则无解； [a=1 b=-1 c=2]对应的结果是-1和2两个解，[a=1 b=2 c=1]对应的结果是-1一个解，
  * 提示1：x1=(-b+sqrt(b2-4ac))/2a
  * X2=(-b-sqrt(b2-4ac))/2a
  * 提示2：sqrt(num)  在 scala 包中(默认引入的) 的math 的包对象有很多方法直接可用.
  */
object Exercise03 {

  def main(args: Array[String]): Unit = {

    val a = 1
    val b = -1
    val c = -2
    val n = b * b - 4 * a * c
    if (n > 0) {
      val x1 = (-b + sqrt(n)) / 2 * a
      val x2 = (-b - sqrt(n)) / 2 * a
      println("有两个解 x1=" + x1.formatted("%.2f") + "x2=" + x2.formatted("%.2f"))
    } else if (n == 0) {
      val x3 = -b/2*a
      println("只有一个解是： "+x3)
    } else {
      println("该方程无解！")
    }
  }
}
