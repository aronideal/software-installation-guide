Nexus 服务器搭建
================

## 1. 创建 Nexus 服务器登录账户，并切换至

	# useradd -m nexus

	# su - nexus

## 2. 更新包

	$ sudo yum update -y

## 3. 创建基本目录

	$ mkdir -p /opt/softs

	$ mkdir -p /opt/install

	$ cd /opt/install

## 4. 下载安装包

	$ wget http://www.sonatype.org/downloads/nexus-latest-bundle.tar.gz

	$ tar -zxvf nexus-*.tar.gz && mv nexus-*.tar.gz ../softs

## 5. 创建 Nexus 引用

	$ cd /usr/local

	$ ln -s /opt/install/nexus-* nexus

	$ ln -s /opt/install/sonatype-work sonatype-work

## 6. 配置

	$ cd nexus
