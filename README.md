# Sophomore_JavaExperiment

## Experiment 1

编写并调试：

教材 P60-P61 编程题 1-11题

教材 P78 编程题 1-11题

## Experiment 2

1.编写一个交通工具类Vehicle类，创建一个run方法，从控制台中输出“这是交通工具run方法”；创建Vehicle类的三个子类，Motor类表示汽车，Ship类表示船，Aeroplane类表示飞机类，分别写出他们的run方法；创建Motor的二个子类，Bus和Car，分别表示公共汽车和轿车，分别写出各自的run方法；创建一个测试类Test,分别创建上面的各种类，使用相应的run方法。

2.定义一个类A，类中有一个private的整型变量data、设置变量data的方法setData()及获取变量data的方法getData()。编写应用程序测试类A，实现数据的访问和修改。

3.编写应用程序，其中重载了以下3个方法。
int volume(int a):求立方体的体积，参数a是边长。
int volume(inta,int b,int c):求长方体的体积，参数a,b,c分别是长方体的长、宽和高。
double volume(double r,double h):求圆柱体的体积，参数r,h分别是圆柱体的半径和高。
根据题目要求完成这3个方法的定义并使用它们。

4.定义接口myItfc，接口中只有一个名为area的方法，该方法有一个double类型参数，返回类型也为double。编写一个应用程序，并实现接口myItfc，接口中area方法的实现是返回参数的立方值；在应用程序中调用该方法并输出其结果。

## Experiment 3

1.编写一个Application并定于一个异常类，要求完成如下操作。定于一个money类，包括：
存款余额：成员变量yu
存款操作：方法putmoney(double money)
取款操作：方法getmoney(double money)
获取余额：方法getyu()
如果存款余额小于取款额时，显示当前余额，并告之不能取款，否则显示取款成功的信息。

2.实现两个定时线程，一个线程每隔1S显示一次，一个线程每隔3S显示一次。

3.编写一个类，类名为MulThread，定义含一个字符串参数的构造方法，并实现Runnable接口，接口中的run()方法如下实现，方法先在命令行显示该线程信息，然后随机休眠小于1S的时间，最后显示线程结束信息：finished+线程名。编写一个Application程序，创建MulThread类的3个线程对象t1,t2,t3，并再启动这3个线程。

## Experiment 4

1.P345第9题。

2.设计一个窗口，内含一个按钮。开始运行时，按钮显示“click me！”字样，但按下按钮时，按钮上面的文字变成“click me again”，再按一次，则会变成“click me！”。如此循环。

3.编写一个应用程序，设计4个按钮，分别命名“加”，“减”，“乘”，“除”；有3个文本框。单击相应的按钮，将两个文本框的数字做运算，在第三个文本框中显示结果。

4.编写一个图形用户界面的应用程序，包括两个文本框和一个按钮，当单击按钮时，可以把一个文本框中的内容复制到另一个文本框中。

5.编写一个应用程序，要求有一个含有菜单的窗口，窗口中有文本区组件。菜单有“打开文件”的菜单项，当单击该菜单项时，使用输入流将一个名为“hello.txt” 文件的内容读入到文本区中。
