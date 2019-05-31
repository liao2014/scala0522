package com.liao.chapter06.homework03

/**
  * 1、一个数字如果为正数，则它的signum为1，
  * 如果是负数，则signum为-1；如果为0，则signum为0。
  * 编写一个函数来计算这个值。
  */
object Exercise01 {
  def main(args: Array[String]): Unit = {
    println(fun1(10))
    println(fun1(0))
    println(fun1(-10))
  }

  def fun1(n: Int): Int = {
    if (n > 0) {
      1
    } else if (n == 0) {
      0
    } else {
      -1
    }
  }
}
