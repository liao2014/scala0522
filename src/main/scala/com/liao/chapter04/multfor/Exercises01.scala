package com.liao.chapter04.multfor

import scala.io.StdIn

/**
  * 练习题
  * 统计三个班成绩情况，每个班有5名同学，
  * 求出各个班的平均分和所有班级的平均分
  * [学生的成绩从键盘输入]。
  */
object Exercises01 {

  def main(args: Array[String]): Unit = {

    //1、classNum表示班级个数，stuNum表示学生个数
    //2、classScore表示各个班级总分，totalScore表示所有班级总分
    //3、score表示各个学生成绩
    //4、使用循环的方式输入成绩
    val classNum = 3
    val stuNum = 5
    var score = 0.0
    var classScore = 0.0 //班级的总分
    var totalScore = 0.0 //所有班级的总分
    for (i <- 1 to classNum) {
      //先将classNum清除0
      classScore = 0.0
      for (j <- 1 to stuNum) {
        printf("请输入第%d个班级中第%d个学生的成绩", i, j)
        score = StdIn.readDouble()
        classScore += score
      }
      //累积totalScore
      totalScore += classScore
      printf("第%d个班级的平均分为%.2f：", i, classScore / stuNum)
    }
    printf("所有班级的平均分为%.2f", totalScore / (classNum * stuNum))
  }

}
