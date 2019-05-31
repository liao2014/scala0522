package com.liao.chapter06.constructor

import scala.beans.BeanProperty

/**
  * Bean属性案例：@BeanProperty
  */
object Demo05 {
  def main(args: Array[String]): Unit = {
    val car1 = new Car
    car1.name="宝马"
    println(car1.name)

    //下面使用BeanProperty自动生成的getXxx和setXxx方法
    val car2 = new Car
    car2.setName("大奔驰")
    println(car2.getName)
  }
}
class Car{
  @BeanProperty var name:String=null
}