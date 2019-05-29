package com.liao.chapter04.ifelse

/**
  * 1、定义两个变量Int，判断二者的和，是否既能被3又能被5整除，打印提示信息
  */
object Exercise01 {

  def main(args: Array[String]): Unit = {

    val num1 = 10
    val num2 = 2
    val sum = num1 + num2
    if (sum % 3 == 0 && sum % 5 == 0) {
      println("能被3和5同时整除")
    }else{
      println("不能 被3和5同时整除")
    }
  }
}
