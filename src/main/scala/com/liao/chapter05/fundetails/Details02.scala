package com.liao.chapter05.fundetails


object Details02 {
  def main(args: Array[String]): Unit = {

  }
  /**
    * 如果函数明确使用return关键字，那么函数返回就不能使用自行推断了,这时要明确写成 : 返回类型 =  ，
    * 当然如果你什么都不写，即使有return 返回值为()。
    */
  def getSum(n1: Int, n2: Int): Int = {
    //因为这里有明确的return, 这时getSum就不能省略返回值 : Int =
    return n1 + n2
  }

  //什么都没写，表示没有返回值，这个时候return是无效的
  def getSum2(n1: Int, n2: Int) {
    return n1 + n2
  }
  //如果函数明确声明无返回值（声明Unit），那么函数体中即使使用return关键字也不会有返回值。
  //返回值写成Unit，这个时候return是无效的
  def getSum3(n1: Int, n2: Int):Unit= {
    return n1 + n2
  }
}
