Nexus Repository OSS 2.x 服务器搭建 （CentOS 7）
==============================================

## 1. 创建 Nexus 服务器登录账户，并切换至

	# useradd -m nexus

	# su - nexus

## 2. 更新包

	$ sudo yum update -y

## 3. 创建基本目录

	$ sudo mkdir -p /opt/softs

	$ sudo mkdir -p /opt/install

	$ cd /opt/install

## 4. 下载安装包

	$ sudo wget http://www.sonatype.org/downloads/nexus-latest-bundle.tar.gz

	$ sudo tar -zxvf nexus-*.tar.gz && sudo mv nexus-*.tar.gz ../softs

## 5. 创建 Nexus 引用

	$ cd /usr/local

	$ sudo ln -s /opt/install/nexus-* nexus

	$ sudo ln -s /opt/install/sonatype-work sonatype-work

## 6. 配置 Nexus 服务端口号（推荐忽略，默认端口 8081）

	$ sudo vim /usr/local/nexus/conf/nexus.properties

## 7. 进行访问 Nexus 主页

	http://ip:8081/nexus

## 8. 基本配置

用默认密码登录: admin/admin123

#### 配置发信邮箱

点击： Administration/Server
SMTP Settings:

#### 设置远程超时时间

> 60 seconds









