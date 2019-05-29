package com.liao.chapter04.ifelse

/**
  * 判断一个年份是否是闰年，闰年的条件是符合下面二者之一：(1)年份能被4整除，但不能被100整除；(2)能被400整除
  */
object Exercise02 {

  def main(args: Array[String]): Unit = {

    //定义一个变量保存年份
    val year = 2000
    if ((year % 4 == 0 && year % 100 != 0)||(year%4==0)){
      println(s"${year}是闰年！")
    }else{
      println(s"${year}不是闰年！！")
    }
  }
}
