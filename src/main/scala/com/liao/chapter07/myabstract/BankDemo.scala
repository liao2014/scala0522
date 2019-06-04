package com.liao.chapter07.myabstract

/**
  * 抽象案例：一个简单的银行存取款示例
  */
object BankDemo {
  def main(args: Array[String]): Unit = {
    val account = new Account("001",850,"123456")
    account.query("123456")
    account.drawMoney("123456",100)
    account.query("123456")
  }
}

//编写一个Account类
//属性：账号、余额、密码
//方法：查询、取款、存款
class Account(inAccount: String, inBalance: Double, inPwd: String) {
  val accountNo = inAccount
  var balance = inBalance
  var pwd = inPwd

  //下面定义一个查询的方法
  def query(pwd1: String): Unit = {
    if (!this.pwd.equals(pwd1)) {//this.pwd是父类的pwd，pwd1是自己方法中传入的参数。
      println("this.pwd"+this.pwd)
      println("pwd1"+pwd1)
      println("密码错误")
      return
    }
    printf("账号是%s，当前余额是%.2f \n",this.accountNo,this.balance)
  }

  //取款
  def drawMoney(pwd1: String, money: Double): Any = {
    if (!this.pwd.equals(pwd1)) {
      println("密码错误")
      return
    }
    if (this.balance < money) {
      println("余额不足")
      return
    }
    this.balance -= money
    money
  }
}