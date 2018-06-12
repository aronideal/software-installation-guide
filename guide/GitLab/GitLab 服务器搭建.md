GitLab 服务器搭建 （CentOS 7）
=================

## 1. 创建 GitLab 服务器登录账户，并切换至

	# useradd -m gitlab
	
	# su - gitlab

## 2. 更新包

	$ sudo yum update -y

## 3. 生成 Yum 源

	$ curl -s https://packages.gitlab.com/install/repositories/gitlab/gitlab-ce/script.rpm.sh | sudo bash

## 4. 安装 GitLab 软件

	$ sudo yum install -y gitlab-ce

## 5. 配置 GitLab 服务

	$ sudo vim /etc/gitlab/gitlab.rb

#### 5.1. 配置外部访问地址，请指定远程登录地址的根路径

	external_url 'http://xxx.com'

#### 5.2. 配置提醒邮箱

	gitlab_rails['smtp_enable'] = true

	gitlab_rails['smtp_address'] = 'localhost'

	gitlab_rails['smtp_port'] = 25

	gitlab_rails['smtp_domain'] = 'localhost'

	gitlab_rails['smtp_tls'] = false

	gitlab_rails['smtp_openssl_verify_mode'] = 'none'

	gitlab_rails['smtp_enable_starttls_auto'] = false

	gitlab_rails['smtp_ssl'] = false

	gitlab_rails['smtp_force_ssl'] = false

## 6. 使配置生效，并启动 GitLab 服务（这一步请耐心等待全部执行完成跳到命令行）

	$ sudo gitlab-ctl reconfigure

## 7. 测试 GitLab 配置的正确性

	$ sudo gitlab-rails console

## 8. 检查 GitLab 服务启动状态，然后用外部访问地址进行访问

	$ sudo gitlab-ctl status

	http://xxx.com

## 9. 初次访问 GitLab 页面，需设置 GitLab root 的用户密码

注意，这里的密码不是服务器系统 root 的密码

