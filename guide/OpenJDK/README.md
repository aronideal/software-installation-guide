
# OpenJDK安装与配置

## 安装前准备工作

### 卸载干净之前已安装的OpenJDK Java环境(建议也同样检查非OpenJDK Java环境，卸载干净)
	yum remove *openjdk*
	rpm -qa | grep openjdk && rpm -e ...

## 安装Java开发和运行环境（JDK安装后包含JRE，无需再单独安装JRE）

### JDK 8
	yum install -y java-1.8.0-openjdk-devel

### JRE 8
	yum install -y java-1.8.0-openjdk

### JDK 7
	yum install -y java-1.7.0-openjdk-devel

### JRE 7
	yum install -y java-1.7.0-openjdk

### JDK 6
	yum install -y java-1.6.0-openjdk-devel

### JRE 6
	yum install -y java-1.6.0-openjdk

## 配置环境

### JDK 8
	export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk
	export JRE_HOME=/usr/lib/jvm/jre-1.8.0-openjdk
	export CLASSPATH=.:$JAVA_HOME/lib/tools.jar:$JAVA_HOME/lib/dt.jar
	export PATH=$JAVA_HOME/bin:$PATH

### JRE 8
	export JAVA_HOME=/usr/lib/jvm/jre-1.8.0-openjdk
	export PATH=$JAVA_HOME/bin:$PATH

### JDK 7
	export JAVA_HOME=/usr/lib/jvm/java-1.7.0-openjdk
	export JRE_HOME=/usr/lib/jvm/jre-1.7.0-openjdk
	export CLASSPATH=.:$JAVA_HOME/lib/tools.jar:$JAVA_HOME/lib/dt.jar
	export PATH=$JAVA_HOME/bin:$PATH

### JRE 7
	export JAVA_HOME=/usr/lib/jvm/jre-1.7.0-openjdk
	export PATH=$JAVA_HOME/bin:$PATH

### JDK 6
	export JAVA_HOME=/usr/lib/jvm/java-openjdk
	export JRE_HOME=/usr/lib/jvm/jre-openjdk
	export CLASSPATH=.:$JAVA_HOME/lib/tools.jar:$JAVA_HOME/lib/dt.jar
	export PATH=$JAVA_HOME/bin:$PATH

### JRE 6
	export JAVA_HOME=/usr/lib/jvm/jre-openjdk
	export PATH=$JAVA_HOME/bin:$PATH

## 其它Linux安装方法
请在官网查找答案：http://openjdk.java.net/install/


