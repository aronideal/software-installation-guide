
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
    
    export MAVEN_HOME PATH

### 配置settings.xml

    $ vim $MAVEN_HOME/conf/settings.xml
    
1. 指定下载仓库位置。改变&lt;localRepository&gt;/path/to/local/repo&lt;/localRepository&gt;值，如：

```xml
<localRepository>/opt/.m2/repository</localRepository>
```

2. 设置登录信息（使用私服服务器时需要配置）

```xml
<server>
    <id>nexus</id>
    <username>admin</username>
    <password>admin123</password>
</server>
```

## 集成到Eclipse
