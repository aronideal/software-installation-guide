
# 1. 先决条件

* 先安装好 python3 支持

# 2. 安装软件

    pip install jupyter

# 3. 更新更新

    pip uninstall jupyter
    
    pip install jupyter

# 4. 配置 Jupyter

## 确定创建自定义目录的路径，如：

    D:\

## 创建需要的目录

    mkdir D:\jupyter\config
    
    mkdir D:\jupyter\notebook

## 生成配置文件，放到 config 目录下

执行完以下命令，会打印出配置文件生成的位置。找到后copy到config目录下

    jupyter notebook --generate-config

## 修改配置文件 jupyter_notebook_config.py

### 去掉 c.NotebookApp.notebook_dir 前边的 #，值配置成以下形式：

    c.NotebookApp.notebook_dir = 'D:\jupyter\notebook'

### 其它配置项依个人喜好修改

### 注意，配置文件中如果需要书写中文，请使用工具格式化成 ASCII 形式存入，不能直接写入中文形式。例如：

    c.NotebookApp.notebook_dir = 'D:/\u5174\u8da3/jupyter/notebook'

# 5. 启动，同时加载配置文件

    jupyter notebook --config D:\jupyter\config\jupyter_notebook_config.py

还可以直接使用 [bat 脚本](./start-jupyter-web.bat)（配置路径请自行修改），不用每次都用命令行启动。

# 6. 快捷键

* Shift+Tab 单击，简略帮助；双击，完整帮助

* Ctrl+S 保存文件

* Shift-Enter : 运行本单元，选中下个单元

* Ctrl-Enter : 运行本单元

* Alt-Enter : 运行本单元，在其下插入新单元

