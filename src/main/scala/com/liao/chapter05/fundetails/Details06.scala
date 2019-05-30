package com.liao.chapter05.fundetails

/**
  * 可变参数练习
  */
object Details06 {
  def main(args: Array[String]): Unit = {
    println(sum(1, 2, 3, 4, 5, 6))
  }

  //注意可变参数必须放到所有参数最后！
  def sum(n1: Int, args: Int*) = {
    println("args的长度" + args.length)
    var sum = n1
    for (item <- args) {
      sum += item
    }
    sum
  }
}
