package com.liao.chapter03.arithmetic

object Demo01 {

  def main(args: Array[String]): Unit = {
    var r1: Int = 10 / 3
    println("r1=" + r1) //3
    var r2: Double = 10 / 3
    println("r2=" + r2) //3.0
    var r3: Double = 10.0 / 3
    println("r3=" + r3) //3.3333333333...
    println("r3=" + r3.formatted("%.2f")) //3.33

    //1 %的运算运算规则： x % y = x - x/y * y
    println(10 % 3) //1
    println(-10 % 3) //-1
    println(-10 % -3) //-1
    println(10 % -3) //1

    //++和--，在Scala中没有这两项，使用+=1和-=1代替
    var num1=10
    num1+=1
    println(num1)
    num1-=1
    println(num1)
  }
}
