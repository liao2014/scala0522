package com.liao.chapter04.multfor

/**
  * 打印九九乘法表
  */
object Exercises02 {

  def main(args: Array[String]): Unit = {
    val num = 9
    for (i <- 1 to num) {
      for (j<- 1 to i){
        printf("%d*%d=%d ",j,i,i*j)
      }
      println()
    }
  }
}
