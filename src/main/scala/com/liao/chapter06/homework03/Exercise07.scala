package com.liao.chapter06.homework03

/**
  * 编写一个函数product(s:String)，计算字符串中所有字母的Unicode代码（toLong方法）的乘积。
  */
object Exercise07 {
  def main(args: Array[String]): Unit = {
    println(product("Hello"))
  }
  def product(s:String):Long={
    var res = 1L
    for(i<-s){
      res *=i.toLong
    }
    res
  }
}
