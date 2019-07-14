urule-client使用说明
=====

## 一、环境配置
对resources中的application.properties文件进行参数配置：
* urule.resporityServerUrl: server服务url
* urule.knowledgeUpdateCycle: 获取知识包的方式
* server.port: client服务占用端口号

## 二、启动application
com.fcy.client.UruleClient类中获取KnowledgeService服务，进而可以进行知识包的调用。


## 三、文本安全规范决策说明
文本安全规范决策主要由三个决策流程组成：
* 文字安全判断主流程
* 数字英文长度检测子流程
* 敏感词检测子流程

在对某一文本进行文本安全规范是否合规进行判断时，只需要调用文字安全判断主流程所在知识包，就能进行文本安全合规性判断。

文本安全判断知识包调用demo：com.fcy.client.Application.knowledge.decision.JudgeDecision


### 参考资料
* urule官方文档：[http://www.bstek.com/products/urule](http://www.bstek.com/products/urule)
* urule开源免费版：[https://github.com/youseries/urule](https://github.com/youseries/urule)

### 附：urule-server部署说明
* 建mysql数据库名为：urule_server
* resources中的application.properties文件：mysql环境配置
* 项目打包
* 运行target中的start.sh脚本
* 打开web端：[http://10.8.26.25:8787/urule/frame](http://10.8.26.25:8787/urule/frame)
