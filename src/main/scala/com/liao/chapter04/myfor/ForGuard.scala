package com.liao.chapter04.myfor

/**
  * 循环守卫测试
  */
object ForGuard {

  def main(args: Array[String]): Unit = {
    for(i <- 1 to 5 if i != 2) {
      println(i + "循环守卫测试")
    }
  }
}