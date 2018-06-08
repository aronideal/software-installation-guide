Nginx 服务器搭建
=================

## 1. 创建 Nginx 服务器登录账户，并切换至

	# useradd -m nginx

	# su - nginx

## 2. 更新包

	$ sudo yum update -y

## 3. 制定 Nginx 安装包 yum 源

	$ sudo vim /etc/yum.repos.d/nginx.repo

写入以下内容：

	[nginx]
	name=nginx repo
	baseurl=http://nginx.org/packages/centos/7/$basearch/
	gpgcheck=0
	enabled=1

## 4. 安装 Nginx 软件

	$ sudo yum install -y nginx

## 5. 加入自启动

	$ sudo systemctl enable nginx.service

