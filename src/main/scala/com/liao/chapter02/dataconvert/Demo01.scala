package com.liao.chapter02.dataconvert

object Demo01 {

  def main(args: Array[String]): Unit = {
    //有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算。 5.6 + 97  = >  double
    var num1 = 5.6f
    var num2 = 97
    var num3 = num1 + num2
    //(byte, short) 和 char之间不会相互自动转换。
    //var char1:Char=num2 //这个不能自动转换
    var char1:Char=num2.toChar //要转换必须手动转换
    println(num3)
    println(char1)
  }
}
