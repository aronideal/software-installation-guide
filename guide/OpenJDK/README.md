
# OpenJDK 安装与配置

## 安装前准备工作

### 卸载干净之前已安装的OpenJDK Java环境(建议也同样检查非Java环境，卸载干净)

#### CentOS

	$ sudo yum remove *jdk*
	$ sudo yum remove *jre*
	$ sudo yum remove *java*
	rpm -qa | grep jdk && rpm -e ...
	rpm -qa | grep jre && rpm -e ...
	rpm -qa | grep java && rpm -e ...

#### Debian、Ubuntu

##### 从候选项列表移除要卸载的java路径

	$ update-alternatives --list java

	$ sudo update-alternatives --remove java /usr/lib/jvm/jdk-8-oracle-arm32-vfp-hflt/bin/java

##### 查找到需要卸载的java包，并卸载（如oracle-java8-jdk）

	$ dpkg --list | grep java

	$ sudo apt-get purge oracle-java8-jdk

## 安装过程

### 安装 Java 开发环境（JDK 包含 JRE，无需再单独安装 JRE）

#### CentOS

##### JDK 8

	$ sudo yum install -y java-1.8.0-openjdk-devel

##### JDK 7

	$ sudo yum install -y java-1.7.0-openjdk-devel

##### JDK 6

	$ sudo yum install -y java-1.6.0-openjdk-devel

#### Debian、Ubuntu

##### JDK 8

	$ sudo apt-get install -y openjdk-8-jdk

##### JDK 7

	$ sudo apt-get install -y openjdk-7-jdk

##### JDK 6

	$ sudo apt-get install -y openjdk-6-jdk

### 安装 Java 运行环境

#### CentOS

##### JRE 8

	$ sudo yum install -y java-1.8.0-openjdk

##### JRE 7

	$ sudo yum install -y java-1.7.0-openjdk

##### JRE 6

	$ sudo yum install -y java-1.6.0-openjdk

#### Debian && Ubuntu

##### JRE 8

	$ sudo apt-get install -y openjdk-8-jre

##### JRE 7

	$ sudo apt-get install -y openjdk-7-jre

##### JRE 6

	$ sudo apt-get install -y openjdk-6-jre

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


