package com.liao.chapter06.homework03

/**
  * 3、针对下列Java循环编写一个Scala版本:
  * for(int i=10;i>=0;i–-)System.out.println(i);
  */
object Exercise03 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10 reverse){//注意不能直接写10 to 1
      println(i)
    }
  }
}
