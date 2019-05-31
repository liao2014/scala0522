package com.liao.chapter06.constructor

/**
  * 构造器参数示例
  */
object Demo04 {
  def main(args: Array[String]): Unit = {
    val worker = new Worker1("zhaoliu")
    //这个时候不能访问worker.inName
    worker.name

    //可以访问inName，不能赋值
    val worker2 = new Worker2("zhangsan")
    worker2.inName
    worker2.name

    //可以赋值
    val worker3 = new Worker3("lisi")
    worker3.inName = "wangwu"
    worker3.inName
    worker3.name
  }
}

//1、如果主构造器是Worker(inName: String)，那么inName就是一个局部变量
class Worker1(inName: String) {
  val name = inName
}

//1、如果主构造器是Worker2(val inName: String)，
// 那么inName就是Worker2一个private只读属性
class Worker2(val inName: String) {
  val name = inName
}

//1、如果主构造器是Worker3(var inName: String)，
//那么inName就是Worker3的一个private的可以读写属性
class Worker3(var inName: String) {
  val name = inName
}
