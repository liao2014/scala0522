package com.liao.chapter06.oop

/**
  * 以猫的属性问题引入面向对象编程的示例
  */
object CatDemo {
  def main(args: Array[String]): Unit = {

    val cat = new Cat
    cat.name="whiteCat"
    cat.age=3
    cat.color="white"
    printf("猫的信息如下：%s %d %s",cat.name,cat.age,cat.color)
  }
}
/**
  * 定义一个类Cat
  * 一个class Cat对应的字节码文件只有一个Cat.class，默认是public
  */
class Cat{
  //定义声明了三个属性
  //1、声明了var name: String时候，底层对应为private name
  //2、同时会生成两个public的方法：name()类似于getter，
  //public name_$eq()类似于setter
  var name: String = ""//给初始值
  var age: Int = _ //_表示给age一个默认的值，根据前面的类型自动推断，所以前面必须标明类型
  var color:String =_ //_给color默认值，如果是String，默认就是null
}
//Cat编译后的源码如下：
/*
public class Cat
{
  private String name = "";
  private int age;
  private String color;

  public String name()
  {
    return this.name; }
  public void name_$eq(String x$1) { this.name = x$1; }
  public int age() { return this.age; }
  public void age_$eq(int x$1) { this.age = x$1; }
  public String color() { return this.color; }
  public void color_$eq(String x$1) { this.color = x$1; }

}
 */
//属性引用案例如下
/*
class Dog1 {
  val name="dog1"
  val dog2 = new Dog2
}
class Dog2 {
}
*/
