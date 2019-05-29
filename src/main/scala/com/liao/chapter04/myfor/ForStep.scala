package com.liao.chapter04.myfor

/**
  * 控制步长例子
  */
object ForStep {

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      println("i= " + i)
    }

    //方法一：使用Range控制步长为2
    for (i <- Range(1, 10, 2)) {
      println("i= " + i)
    }
    //方法二：使用for循环守卫控制步长为3
    for (i <- 1 to 10 if i % 3 == 1) {
      println("i= " + i)
    }
  }
}
