package com.liao.chapter02.datatype

object TypeDemo2 {

  def main(args: Array[String]): Unit = {
    println(sayHello)
  }

  /**
    * 使用Nothing作为返回值进行判断。
    * @return
    */
  def sayHello:Nothing={
    throw new Exception("抛出异常测试")
  }
}
