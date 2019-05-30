package com.liao.chapter05.exercise

/**
  * 函数可以没有返回值案例，编写一个函数,从终端输入一个整数打印出对应的金子塔。
  * 每一行的个数为 1 3 5 7 9 11 ....
  */
object Exercise01 {
  def main(args: Array[String]): Unit = {
    fun(5)
  }

  def fun(num: Int): Unit = {
    for (i <- 1 to num) {
      print(" " * (num - i)) //这些空格将*居中
      for (j <- 1 to (2 * i - 1)) {
        print("*")
      }
      println()
    }
  }
}
