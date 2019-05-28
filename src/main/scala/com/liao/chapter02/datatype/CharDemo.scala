package com.liao.chapter02.datatype

object CharDemo {

  def main(args: Array[String]): Unit = {
    var ch1: Char = 97
    //当输出一个char类型的变量的时候，会根据数字找到对应的字符，根据Unicode（包含Ascii码表）
    println("ch1=" + ch1)

    //Char可以当做数字进行运算
    var ch2: Int = 'a'
    println(ch2 + 20)
  }

}
