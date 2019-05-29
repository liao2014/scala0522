package com.liao.chapter04.myfor

object ForYield {

  def main(args: Array[String]): Unit = {
    //1、对1 to 10 进行遍历
    //2、yield i*2 将每次循环得到的i乘以2放到集合Vector中，并放回给res
    //3、i这里是一个代码块，可以对i进行处理
    val res = for(i <- 1 to 10) yield i*2
    println(res)
  }
}
