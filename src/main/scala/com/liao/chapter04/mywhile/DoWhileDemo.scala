package com.liao.chapter04.mywhile

/**
  * dowhile测试
  */
object DoWhileDemo {

  def main(args: Array[String]): Unit = {
    var i = 0
    do {
      println("helloworld" + i)
      i += 1
    } while (i < 10)
  }
}
