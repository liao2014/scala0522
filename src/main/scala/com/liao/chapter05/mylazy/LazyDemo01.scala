package com.liao.chapter05.mylazy

/**
  * 惰性函数示例
  */
object LazyDemo01 {
  def main(args: Array[String]): Unit = {
    lazy val res = sum(10, 20)//给lazy去掉加上多看看输出的顺序，注意理解，其实栈的顺序
    println("-----------------")
    println("res=" + res) //在要使用res 前，才执行
  }

  def sum(n1: Int, n2: Int): Int = {
    println("sum()执行了...")
    return n1 + n2
  }

}
