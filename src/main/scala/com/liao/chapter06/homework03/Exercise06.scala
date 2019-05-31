package com.liao.chapter06.homework03

/** 5、编写一个for循环，计算字符串中所有字母的Unicode代码（toLong方法）的乘积。
  * 举例来说，"Hello"中所有字符串的乘积为9415087488L。
  * 6、同样是解决前一个练习的问题，请用StringOps的foreach方式解决。
  */
object Exercise06 {
  def main(args: Array[String]): Unit = {
    var res = 1L
    //_表示每一个字符，foreach表示将每个参数传入到后面括号里面的整个函数
    "Hello".foreach(res*=_.toLong)
    println(res)
  }
}
