//注意这里的包名不能写for，因为for是关键字
package com.liao.chapter04.myfor

object ForDemo01 {

  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 5
    //1、start代表从哪个开始
    //2、to是关键字
    //3、end循环结束值
    //start to end表示前后闭合
    for (i <- start to end) {
      println(i + "helloworld")
    }
    //使用for推导时候，可以直接对集合进行遍历
    var list = List("hello", 1, 2.3, 'a')
    for (item <- list) {
      println("item=" + item)
    }
  }
}
