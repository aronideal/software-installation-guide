
# OpenJDK安装与配置

## 安装前准备工作

### 卸载干净之前已安装的OpenJDK Java环境(建议也同样检查非Java环境，卸载干净)

#### CentOS

	$ sudo yum remove *jdk*
	$ sudo yum remove *jre*
	$ sudo yum remove *java*
	rpm -qa | grep jdk && rpm -e ...
	rpm -qa | grep jre && rpm -e ...
	rpm -qa | grep java && rpm -e ...

#### Debian && Ubuntu

##### 从候选项列表移除要卸载的java路径：

	$ update-alternatives --list java

	$ sudo update-alternatives --remove java /usr/lib/jvm/jdk-8-oracle-arm32-vfp-hflt/bin/java

##### 查找到需要卸载的java包，并卸载掉，如oracle-java8-jdk：

	$ dpkg --list | grep java

	$ sudo apt-get purge oracle-java8-jdk

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

### JDK
	export JAVA_HOME=/usr/lib/jvm/java-openjdk
	export JRE_HOME=/usr/lib/jvm/jre-openjdk
	export CLASSPATH=.:$JAVA_HOME/lib/tools.jar:$JAVA_HOME/lib/dt.jar
	export PATH=$JAVA_HOME/bin:$PATH

### JRE
	export JAVA_HOME=/usr/lib/jvm/jre-openjdk
	export PATH=$JAVA_HOME/bin:$PATH

## 更多安装方法
请在官网查找：http://openjdk.java.net/install/


