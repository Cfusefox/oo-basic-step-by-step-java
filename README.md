# OO basic step by step with Java
适用对象：
1. 没有Java面向对象经验的人快速验证自己是否已经具备了用Java进行基本的面向对象编程的能力
2. 没有面向对象经验的人通过完成测试来验证自己已经具备了用Java进行基本的面向对象编程的能力。

## 需求
根据测试目录下各包下README.md中的需求编写代码，使得测试代码可以运行通过。

## 挑战
* 理解构造器
* 理解封装
* 理解继承
* 理解多态
* 理解接口
* 理解观察者模式

## 要求
* 根据src/test/java/paractice_*/README.md完成对应的src/main/java/practice_*/的代码。要求测试通过，并符合题目要求。
* 能够理解代码的执行过程中都发生了什么，如果不能够理解，使用调试器进行单步调试来辅助理解。
* 每完成一个练习至少提交一次代码。
* 反注释测试代码以执行。

## 交付物
不修改测试代码，只修改实现代码，使得测试全部通过。

## 环境
* Java 8
* Gradle 4.2.1
* JUnit 4

## 开始
在命令行中使用以下命令在用户本地任意目录下clone此题目库
```
git clone repo_of_this_template
```

初次下载完需要安装依赖：
```
gradle build
```
运行测试：
```
gradle test
```
执行`gradle idea`，然后`idea .`即可在Intellj IDEA中打开项目。

## 学习资源
1. [Java 继承](http://www.runoob.com/java/java-inheritance.html)
1. [Java 重写(Override)与重载(Overload)](http://www.runoob.com/java/java-override-overload.html)
1. [Java 多态](http://www.runoob.com/java/java-polymorphism.html)
1. [Java 封装](http://www.runoob.com/java/java-encapsulation.html)
1. [Java 接口](http://www.runoob.com/java/java-interfaces.html)
1. [观察者模式](http://www.runoob.com/design-pattern/observer-pattern.html)
