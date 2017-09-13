
# Memcached安装（以1.4.39版本为例，更多版本请在[官方网站](http://memcached.org/downloads)下载）

    $ wget http://www.memcached.org/files/memcached-1.4.39.tar.gz
    $ tar -zxvf memcached-1.4.39.tar.gz
    $ cd memcached-1.4.39
    $ ./configure && make && make test && sudo make install
