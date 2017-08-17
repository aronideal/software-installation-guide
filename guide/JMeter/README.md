
# 先决条件

对照安装Java（已安装下载匹配的JMeter版本）

        Apache JMeter 3.2 (Requires Java 8 or later)
        Apache JMeter 3.0-3.1 (Requires Java 7 or later)
        Apache JMeter 2.x requires Java 6 or later)

# JMeter安装（以3.1版本为例，更多版本请在[官方网站](https://archive.apache.org/dist/jmeter/binaries/)下载）

Linux版

        $ wget http://mirrors.hust.edu.cn/apache//jmeter/binaries/apache-jmeter-3.1.tgz
        $ tar zxvf apache-jmeter-3.1.tgz
        $ cd apache-jmeter-3.1
        $ java -jar bin/ApacheJMeter.jar

Windows版

        下载 https://archive.apache.org/dist/jmeter/binaries/apache-jmeter-3.1.zip
        解压缩得到 apache-jmeter-3.1
        进入 apache-jmeter-3.1/bin，运行 java -jar ApacheJMeter.jar

# 第一个Java程序的测试

测试计划命名为“第一个Java程序的测试”

创建线程组

        右击“第一个Java程序的测试”，依次选择【添加】->【Threads(Users)】->【线程组】

创建Java请求

        右击“线程组”，依次选择【添加】->【Sampler】->【Java请求】

创建查看结果树

        右击“线程组”，依次选择【添加】->【监听器】->【查看结果树】

创建聚合报告

        右击“线程组”，依次选择【添加】->【监听器】->【聚合报告】

# 在Linux上运行

在win设置“第一个Java程序的测试”的调度器，设置启动时间、停止时间等。

Linux上执行命令： sh jmeter.sh -n -t my_test.jmx -l test_*.jtl

