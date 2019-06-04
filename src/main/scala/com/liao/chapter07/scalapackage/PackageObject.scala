package com.liao.chapter07.scalapackage

/**
  * 包对象示例
  */
//此文件源码路径为：src\main\scala\com\liao\chapter07\scalapackage
//此文件本地编译后路径为：target\classes\com\liao\chapter07\scalapackage\com\liao\scala
//所以可以看出编译后的路径可以和源码路径不一致。
package com.liao {

  //说明如下：
  //1、每个包都可以有一个包对象。你需要在父包(com.liao)中定义它,且名称与子包一样。
  //2、package object scala表示创建了一个包对象scala，与下面的package scala对应。
  //3、每个包都可以有一个包对象
  //4、包对象的名字需要和子包一样。
  //5、在包对象中可以定义方法、变量
  //6、在包对象中定义的方法和变量可以在对应的包中进行使用
  //7、编译后底层这个包对象会生成package.class和package$.class
  package object scala {
    var name = "jack"

    def sayOk(): Unit = {
      println("package object sayOk!")
    }
  }
  package scala {

    class Test {
      def test(): Unit = {
        //这里的name就是包对象scala中声明的name
        println(name)
        sayOk() //这个sayOk 就是包对象scala中声明的sayOk
      }
    }

    object TestObj {
      def main(args: Array[String]): Unit = {
        val t = new Test()
        t.test()
        //因为TestObje和scala这个包对象在同一包，因此也可以使用
        println("name=" + name)
      }
    }

  }

}
