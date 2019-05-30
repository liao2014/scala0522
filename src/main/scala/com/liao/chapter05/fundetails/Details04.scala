package com.liao.chapter05.fundetails

/** Scala函数的形参，在声明参数时，直接赋初始值(默认值)，这时调用函数时，
  * 如果没有指定实参，则会使用默认值；如果指定了实参，则实参会覆盖默认值。
  */
object Details04 {
  def main(args: Array[String]): Unit = {
    print(hello())
    print(hello("lisi"))
  }
  def hello(name:String="zhangsan")={
    name+"您好！"
  }
}
