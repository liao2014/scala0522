package com.liao.chapter05.fun

object FunDemo01 {

  def main(args: Array[String]): Unit = {
    val n1 = 10
    val n2 = 20
    println(getRes(n1,n2,'+'))
  }

  def getRes(n1: Int, n2: Int, oper: Char) = {
    if ('+' == oper) {
      n1 + n2
    } else if ('-' == oper) {
      n1 - n2
    } else {
      //操作符输入错误的时候返回null
      null
    }
  }
}
