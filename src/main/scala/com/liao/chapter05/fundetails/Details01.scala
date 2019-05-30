package com.liao.chapter05.fundetails

/**
  * 形参列表和返回值列表的数据类型可以是值类型和引用类型。
  */
object Details01 {

  def main(args: Array[String]): Unit = {

    val dog = new Dog
    val dog2 = test1(11, dog)
    println(dog.name) //dogname
    println(dog2.name) //dogname
    println(dog.hashCode() + "   " + dog2.hashCode())
  }

  def test1(n1: Int, dog: Dog): Dog = {
    println(n1)
    dog.name = "dogname"
    dog
  }

  //Scala中的函数可以根据函数体最后一行代码自行推断函数返回值类型。那么在这种情况下，return关键字可以省略。
  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }

  //因为Scala可以自行推断，所以在省略return关键字的场合，返回值类型也可以省略。
  def sum2(n1: Int, n2: Int) = {
    n1 + n2
  }
}

class Dog {
  //定义一个名字属性
  var name = ""
}
