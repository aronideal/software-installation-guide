GitLab 服务器搭建 （CentOS 7）
=================

## 1. 创建 GitLab 服务器登录账户，并切换至

	# useradd -m gitlab
	
	# su - gitlab

## 2. 生成 Yum 源

	$ curl -s https://packages.gitlab.com/install/repositories/gitlab/gitlab-ce/script.rpm.sh | sudo bash

## 3. 安装 GitLab 软件

	$ sudo yum install -y gitlab-ce

## 4. 配置 GitLab 服务

	$ sudo vim /etc/gitlab/gitlab.rb

#### 4.1. 配置外部访问地址，请指定远程登录地址的根路径

	external_url 'http://xxx.com'

#### 4.2. 配置提醒邮箱

	gitlab_rails['smtp_enable'] = true

	gitlab_rails['smtp_address'] = 'localhost'

	gitlab_rails['smtp_port'] = 25

	gitlab_rails['smtp_domain'] = 'localhost'

	gitlab_rails['smtp_tls'] = false

	gitlab_rails['smtp_openssl_verify_mode'] = 'none'

	gitlab_rails['smtp_enable_starttls_auto'] = false

	gitlab_rails['smtp_ssl'] = false

	gitlab_rails['smtp_force_ssl'] = false

## 5. 使配置生效，并启动 GitLab 服务（这一步请耐心等待全部执行完成跳到命令行）

	$ sudo gitlab-ctl reconfigure

## 6. 检查 GitLab 服务启动状态，然后用外部访问地址进行访问

	$ sudo gitlab-ctl status

	http://xxx.com

## 7. 初次访问 GitLab 页面，需设置 GitLab root 的用户密码

注意，这里的密码不是服务器系统 root 的密码

