package com.liao.chapter02.dataconvert

object String2Basic {

  def main(args: Array[String]): Unit = {
    var n1 = 1.2
    var s1 = n1 + "" //基本数据类型转string

    var s2="123"
    var n2 = s2.toInt
    var n4 = s2.toDouble
    var n5 = s2.toLong
    println("ok")

    //把 "12.5" 转成 Int 情况？
    val s3 = "12.5"
    //println(s3.toInt) //运行时会报错，Scala不会自动截取小数点前面的证书进行转换。
    println(s3.toDouble) //正常输出
  }
}
