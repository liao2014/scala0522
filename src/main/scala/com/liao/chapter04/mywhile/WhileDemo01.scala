package com.liao.chapter04.mywhile

object WhileDemo01 {

  def main(args: Array[String]): Unit = {

    //1、定义循环变量
    var i = 0
    //2、判断条件
    while (i < 10) {
      println("helloworld" + i) //循环体
      //循环变量迭代
      i += 1
    }
  }
}
