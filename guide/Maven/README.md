
# Maven安装与配置

## Maven下载并安装

    $ wget http://mirrors.hust.edu.cn/apache/maven/maven-3/3.5.2/binaries/apache-maven-3.5.2-bin.tar.gz
    
    $ tar -zxvf apache-maven-3.5.2-bin.tar.gz && rm -rf apache-maven-3.5.2-bin.tar.gz
    
    $ mv apache-maven-3.5.2-bin apache-maven-3.5.2
    
    $ ln -s apache-maven-3.5.2 maven

## Maven配置

### 配置环境变量

    MAVEN_HOME=/usr/local/maven
    
    PATH=$PATH:$MAVEN_HOME/bin

### 配置settings.xml

## 集成到Eclipse
