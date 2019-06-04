package com.liao.chapter07.myextends

/**
  * 覆写字段，注意理解动态绑定机制
  */
object FiledOverride {
  def main(args: Array[String]): Unit = {
    val obj : A = new B()
    //obj.age 实际是调用的方法 obj.age()
    //输出结果是obj.age = 20
    println("obj.age = " + obj.age)//动态绑定，就是绑定到new 出来的那块内存地址上，也就是等号的右边

    val obj2 : B = new B()
    //obj2.age 实际是调用的方法 obj2.age()
    //输出结果是：obj2.age = 20
    println("obj2.age = " + obj2.age)

  }
}
class A {
  val age : Int = 10
  /*
  在对应的.class 文件生成 public age()....
   */
}

class B extends A {
  /*
 在对应的.class 文件生成 public age()...., 这个方法覆盖了父类的 public age()...
  */
  override val age : Int = 20
}
