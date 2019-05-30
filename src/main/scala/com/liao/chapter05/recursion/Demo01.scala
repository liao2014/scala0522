package com.liao.chapter05.recursion

object Demo01 {

  def main(args: Array[String]): Unit = {

    test(4)
    test2(4)
  }

  def test (n: Int) {
    if (n > 2) {
      test (n - 1)
    }
    println("test中n=" + n) //
  }

  def test2 (n: Int) {
    if (n > 2) {
      test2 (n - 1)
    }else {
      println("test2中n=" + n)
    }
  }

}
