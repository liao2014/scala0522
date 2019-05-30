package com.liao.chapter05.exercise

import scala.io.StdIn

/**
  * 编写一个函数,从终端输入一个整数(1—9),打印出对应的乘法表。
  */
object Exercise02 {
  def main(args: Array[String]): Unit = {
    //这里为了方便不写判断了
    println("输入1-9的数字：")
    val num = StdIn.readInt()
    getMultiplication(num)
  }

  def getMultiplication(num: Int): Unit = {
    for (i <- 1 to num) {
      for (j <- 1 to i) {
        printf("%d*%d=%d ", j, i, i * j)
      }
      println()
    }
  }
}
