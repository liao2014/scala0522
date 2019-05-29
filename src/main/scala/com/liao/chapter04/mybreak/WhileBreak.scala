package com.liao.chapter04.mybreak

import util.control.Breaks._

/**
  * 中断的实现案例
  */
object WhileBreak {

  def main(args: Array[String]): Unit = {
    var n = 0
    breakable {//breakable这里大括号或小括号都可以
      while (n <= 10) {
        n += 1
        println("n= " + n)
        if (n == 7) {
          break()
        }
      }
    }
    println("中断测试，看是否可以输出此句话")
  }
}
