package com.liao.chapter06.homework03

/**
  *  2、一个空的块表达式{}的值是什么？类型是什么？
  */
object Exercise02 {
  def main(args: Array[String]): Unit = {
    var t ={}
    println(t+" ******* "+t.isInstanceOf[Unit])
  }
}
