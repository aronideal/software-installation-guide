
# 停止Broker服务

    sh bin/mqshutdown broker

# 停止NameServer服务

    sh bin/mqshutdown namesrv

# 启动NameServer服务

    nohup sh bin/mqnamesrv > ns.log 2>&1 &
    
    tail -500f ~/logs/rocketmqlogs/namesrv.log

# 启动Broker服务

<b>broker-a处以实际配置文件名称为准：</b>

master为broker-a/broker-b/...

slave为broker-a-s/broker-b-s/...

    nohup sh bin/mqbroker -c $ROCKET_HOME/conf/2m-noslave/broker-a.properties > bk.log 2>&1 &

# 注意事项

启动服务前需先配置nameserver、broker，以及它们之前的关系，请参看《2.配置RocketMQ.md》
