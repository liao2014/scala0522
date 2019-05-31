package com.liao.chapter06.homework03

/**
  * 4、编写一个过程countdown(n:Int)，打印从n到0的数字。
  */
object Exercise04 {
  def main(args: Array[String]): Unit = {
    countdown(5)
    countdown(-5)
  }

  //除了下面的方法，也可可以使用高阶函数实现。
  def countdown(n: Int): Unit = {
    if(n<0){
      for (i <- n to 0) {
        //注意to的前一个参数要不大于后面一个参数
        println(i)
      }
    }else{
      for (i <- 0 to n reverse) {
        //注意to的前一个参数要不大于后面一个参数
        println(i)
      }
    }

  }
}
