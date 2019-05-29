package com.liao.chapter04.ifelse

import scala.io.StdIn

/**
  * 参加百米运动会，如果用时8秒以内进入决赛，否则提示淘汰；
  * 并且根据性别提示进入男子组或女子组。 输入成绩和性别，进行判断。
  */
object Exercise04 {

  def main(args: Array[String]): Unit = {

    println("输入运动员成绩：")
    val speed=StdIn.readDouble()
    if(speed<=8){
      println("输入性别：")
      val gender=StdIn.readChar()
      if(gender=='男'){
        println("恭喜进入男子组")
      }else{
        println("恭喜进入女子组")
      }
    }else{
      println("不好意思，你被淘汰了")
    }
  }
}
