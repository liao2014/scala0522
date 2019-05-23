package com.liao.chapter01

object PrintDemo {

  def main(args: Array[String]): Unit = {
    var str1: String = "Hello"
    var str2: String = " Scala!"
    println(str1 + str2)
    var name: String = "zhangsan"
    var age: Int = 10
    var salary: Float = 20000.50f
    var height: Double = 180.40
    //格式化输出
    printf("姓名是%s 年龄是%d 薪水是%.2f 身高是%.3f", name, age, salary, height)
    //scala支持使用使用$输出内容，编译器会自动解析$对应的变量
    //注意printf里面的前面有一个s
    printf(s"\n个人信息如下：\n 名字为$name  年龄为$age  薪水为$salary")
    //如果在字符串中有出现了类似${age+20}等运算，则表示{}是一个表达式
    printf(s"\n个人信息如下2：\n 名字为${name} 年龄为${age+20}  薪水为${salary*2}")
    var arr = new Array[Int](10)
  }
}
