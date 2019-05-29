package com.liao.chapter04.ifelse

import scala.io.StdIn

object Demo01 {

  def main(args: Array[String]): Unit = {
    printf("请输入年龄：")
    var age = StdIn.readInt()
    if (age > 18) {
      printf("age>18")
    }else{
      printf("不大于18")
    }
  }
}
