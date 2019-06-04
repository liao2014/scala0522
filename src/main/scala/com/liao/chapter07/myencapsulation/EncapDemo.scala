package com.liao.chapter07.myencapsulation

/**
  * 封装的小案例：一个小程序(EncapDemo.scala)，不能随便查看人的年龄、工资等隐私，并对输入的年龄进行合理的验证[要求1-120之间]。
  */
object EncapDemo {
  def main(args: Array[String]): Unit = {
    var p = new Person

    //通过授权的成员方可以访问被封装的属性。
    p.setAge(10)
    println("年龄是： " + p.getAge())
  }
}

class Person {
  var name: String = _
  //var age ; //当是public时，可以随意的进行修改，不安全
  private var age: Int = _
  private var salary: Float = _
  private var job: String = _

  def getSalary(): Float = {
    return salary;
  }

  def setSalary(salary: Float): Unit = {
    this.salary = salary
  }

  def getAge(): Int = {
    return this.age // 也可以写成 age
  }

  def setAge(age: Int): Unit = {
    if (age >= 0 && age <= 120) {
      this.age = age
    } else {
      println("输入的数据不合理");
      //可考虑给一个默认值
      this.age = 20
    }
  }
}
