package com.liao.chapter04.mycontinue

/**
  * Continue的实现案例
  */
object ContinueDemo {

  def main(args: Array[String]): Unit = {
    //1、1 to 10
    //2、循环守卫条件满足，执行循环体
    for (i <- 1 to 10 if (i != 3 && i != 5)) {
      println("i=" + i)
    }

    //也可以写成下面的方式
    for (i <- 1 to 10) {
      if (i != 3 && i != 5) {
        println("i=" + i)
      }
    }
  }
}
