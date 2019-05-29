package com.liao.chapter04.mybreak

import util.control.Breaks._

object Exercise {

  /**
    * 100以内的数求和，求出当和 第一次大于20的当前数
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {

    var sum = 0
    breakable(
      for (i <- 1 to 100) {
        sum += i
        if (sum > 20) {
          println("第一次大于20的当前数为= " + i)
          break()
        }
      }
    )
  }
}
