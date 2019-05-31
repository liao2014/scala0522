package com.liao.chapter06.homework03

/**
  * 7、编写一个函数product(s:String)，
  * 计算字符串中所有字母的Unicode代码（toLong方法）的乘积。和第5题类似。
  * 8、把7练习中的函数改成递归函数。
  */
object Exercise08 {
  def main(args: Array[String]): Unit = {
    println("res====" + product2("Hello"))
    println("Hello".take(1))
    println("Hello".drop(1))//取出除了第一个字符之外的字符串。
  }

  def product2(s: String): Long = {
    if (s.length == 1) {
      s.charAt(0).toLong//注意charAt(0)不能省略，因为字符串不能toLong，字符才可以toLong
    } else {
      s.take(1).charAt(0).toLong * product2(s.drop(1))
    }
  }
}
