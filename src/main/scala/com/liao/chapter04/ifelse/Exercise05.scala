package com.liao.chapter04.ifelse

import scala.io.StdIn

object Exercise05 {

  /**
    * 出票系统：根据淡旺季的月份和年龄，打印票价，票价规则如下：
    * 旺季（4到10月）：
    * 成人（18-60）：60
    * 儿童（<18）:半价
    * 老人（>60）:1/3
    * 淡季（其他时间段）：
    * 成人：40
    * 其他：20
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {

    println("输入月份：")
    val month = StdIn.readInt()
    println("输入年龄：")
    val age = StdIn.readInt()
    val ticker = 60
    if (month >= 4 && month <= 10) {
      if (age >= 18 && age <= 60) {
        println("您的票价为："+ticker)
      } else if(age<18){
        println("您的票价为："+ticker/2)
      }else{
        println("您的票价为："+ticker/3)
      }
    } else {
      if (age >= 18 && age <= 60) {
        println("您的票价为："+40)
      }else{
        println("您的票价为："+20)
      }
    }
  }
}
