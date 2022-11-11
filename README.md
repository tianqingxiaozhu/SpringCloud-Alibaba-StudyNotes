
## 模块说明



## 功能说明


- [ ] 架构师都是如何做技术选型的？
- [x] nacos
  - [x] 注册中心
    - [x] 传统调用方式
    - [x] 使用openfeign方式进行调用
    - [x] openfeign的进阶使用
      - [x] 多参数
      - [x] URL中携带参数
      - [x] 传递对象
      - [x] 文件上传
      - [x] 文件下载
      - [x] 开启GZIP压缩
      - [x] 开启日志
      - [x] 超时控制
      - [x] 替换客户端
    - [x] 注册到不同的命名空间以进行服务隔离
  - [x] 配置中心
    - [x] 传统读取配置文件方式
    - [x] 从配置中心中读取配置项
    - [x] 从共享配置文件中读取配置项
    - [x] 把共享配置文件中的配置项映射成JavaBean
    - [x] 以服务名作为命名空间进行配置隔离
    - [x] 以环境名作为命名空间进行配置隔离
    - [ ] 灰度发布
- [ ] gateway
  - [x] 服务发现的路由规则
  - [x] 重写路由
  - [x] 路由规则可配置化
  - [ ] https的使用[xxx] 现在微服务的部署架构大多情况下是SLB+Nginx类型的部署模型，而微服务大多都是在内网环境中，因此网关也很少使用https；
  - [ ] 自定义全局异常[xxx]
  - [ ] 基于限流及自定义限流异常
  - [x] 集成swagger
  - [ ] CROS方案
  - [ ] 灰度发布
- [ ] Seata
  - [ ]  AT 模式
  - [ ]  TCC 模式
  - [ ]  XA 模式
  - [ ]  Saga 模式 
  - [ ] 两阶段提交事务
- [ ] 基于RabbitMQ使用消息中间件
  - [ ] 创建交换机、binding 、 queue 
  - [ ] 发送消息
  - [ ] 发送消息并确认
  - [ ] 接受消息
  - [ ] 接受消息并确认
- [ ] Cache
- [ ] 其他
  - [ ] 分布式锁
  - [ ] 分布式事务原理
  - [ ] 分布式ID
  - [ ] 分布式相关算法



## 端口统计

- nacos-provider : 10000
- nacos-consumer : 10100
- nacos-config : 10200
- nacos-use-service-name : 10300
- nacos-use-env-name : 10400
- gateway-demo : 10500
- swagger-user : 10600
- swagger-order : 10700
- gateway-swagger : 10800


![](./assets/qrcode.jpg)


    

    



