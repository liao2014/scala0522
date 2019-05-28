package com.liao.chapter03.input

import scala.io.StdIn

/**
  * 从控制台输入信息
  */
object InputDemo {

  def main(args: Array[String]): Unit = {
    println("请输入姓名：")
    val name=StdIn.readLine()
    println("请输入年龄：")
    val age=StdIn.readInt()
    println("请输入薪水：")
    val salary=StdIn.readDouble()
    printf("用户的信息是 姓名=%s 年龄=%d 薪水=%.2f",name,age,salary)
  }
}
