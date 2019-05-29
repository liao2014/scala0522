package com.liao.chapter04.myfor

object ForDemo02 {

  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 5
    //1、start代表从哪个开始
    //2、until是关键字
    //3、end循环结束值
    //start until end表示前闭后开
    for (i <- start until end) {
      println(i + "helloworld")
    }
  }
}
