package com.liao.chapter03.arithmetic

object exercise {

  def main(args: Array[String]): Unit = {

    //（1）假如还有97天放假，问：xx个星期零xx天
    var days = 97
    printf("结果为： %d个星期零%d天", days / 7, days % 7)
    println()
    //（2）定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5/9*(华氏温度-100),求出华氏温度对应的摄氏温度,[测试：232.5]
    var huashi = 232.5
    var sheshi = 5.0 / 9 * (huashi - 100)
    println("对应的摄氏温度为：" + sheshi.formatted("%.2f"))
  }
}
