package com.liao.chapter06.homework03

/**
  * 9、编写函数计算x的n次方的结果，其中n是整数
  */
object Exercise09 {
  def main(args: Array[String]): Unit = {
    println(pow(2,4))
    println(pow(2,-1))
    println(pow(-2,-1))
  }

  //幂函数的运算，x的n次方
  def pow(x: Double, n: Int): Double = {
    if (n == 0) {
      1
    } else if (n > 0) {
      x * pow(x, n - 1)
    } else {
      1 / pow(x, -n)
    }
  }
}
