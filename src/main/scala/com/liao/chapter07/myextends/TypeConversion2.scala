package com.liao.chapter07.myextends

/**
  * 类型转换案例实践   这个也可以看成多态的案例
  */
object TypeConversion2 {
  def main(args: Array[String]): Unit = {
    val stu = new Student3
    val emp3 = new Emp3
    typeTest(stu)
    typeTest(emp3)
  }
  def typeTest(p:Person3): Unit ={
    //使用Scala中类型检查和转换
    if(p.isInstanceOf[Emp3]){
      //p.asInstanceOf[Emp3]，对于p的类型没有任何影响，返回的是Emp3类型
      p.asInstanceOf[Emp3].showEmpInfo()
    }else if(p.isInstanceOf[Student3]){
      p.asInstanceOf[Student3].showStuInfo()
    }else{
      println("转换失败")
    }
  }
}

class Person3 {
  var name: String = "zhangsan3"

  def printName() {
    println("Person3 printName() " + name)
  }
}

//子类雇员类
class Emp3 extends Person3 {
  var empId = 301

  //这里需要显示的使用override
  override def printName() {
    println("Emp3 printName() " + name)
  }

  def showEmpInfo(): Unit = {
    println("雇员的id为： " + this.empId)
  }
}

//子类 学生类
class Student3 extends Person3 {
  var stuId = 302

  //这里需要显示的使用override
  override def printName() {
    println("Student3 printName() " + name)
  }

  def showStuInfo(): Unit = {
    println("学生的id为： " + this.stuId)
  }
}