package com.liao.chapter06.homework03

/**
  * 5、编写一个for循环，计算字符串中所有字母的Unicode代码（toLong方法）的乘积。
  * 举例来说，"Hello"中所有字符串的乘积为9415087488L。
  */
object Exercise05 {
  def main(args: Array[String]): Unit = {
    println(fun("Hello"))
  }

  def fun(s: String): Long = {
    var res: Long = 1L
    for (i <- 0 until s.length) {
      //println(s.charAt(i).toLong)
      res *= s.charAt(i).toLong
    }
    res
  }
}
