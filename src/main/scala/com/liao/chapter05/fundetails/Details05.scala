package com.liao.chapter05.fundetails

/**
  * 如果函数存在多个参数，每一个参数都可以设定默认值，那么这个时候，传递的参数是按照
  * 默认声明顺序[从左到右]进行传递；在这种情况下，可以采用带名参数来修改指定的参数。
  */
object Details05 {
  def main(args: Array[String]): Unit = {
    mysqlCon()
    mysqlCon("127.0.0.1",13306)
    mysqlCon(user = "liao")
  }
  def mysqlCon(add:String = "localhost",port : Int = 3306,
               user: String = "root", pwd : String = "111111"): Unit = {
    println("add=" + add)
    println("port=" + port)
    println("user=" + user)
    println("pwd=" + pwd)
  }

}
