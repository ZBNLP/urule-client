urule-client使用说明
=====

## 一、环境配置
Eclipse导入项目：File->Import->Existing Maven Projects

对src/main/resources中的application.properties文件进行参数配置：
* urule.resporityServerUrl: server服务url，格式为“ip:端口号”，例如：http://10.8.26.25:8787
* urule.knowledgeUpdateCycle: 获取知识包的方式，设置为1
* server.port: client服务占用端口号，例如8010

## 二、启动application
com.fcy.client.UruleClient类中获取KnowledgeService服务，进而可以进行知识包的调用。

```
package com.fcy.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bstek.urule.runtime.service.KnowledgeService;

@SpringBootApplication
public class UruleClient {
	
	public static ConfigurableApplicationContext CONTEXT = SpringApplication.run(UruleClient.class);
	
	public static KnowledgeService KNOWLEDGE_SERVICE = getKnowledgeService();
	
	private static KnowledgeService getKnowledgeService() {
		KnowledgeService knowledgeService = (KnowledgeService) CONTEXT.getBean(KnowledgeService.BEAN_ID);
		return knowledgeService;
	}
}

```

## 三、文本安全规范决策说明、知识包调用示例

* web端项目名称：文本安全规范
* web端项目地址：http://10.8.26.25:8787/urule/frame


#### 3.1 文本安全规范决策说明
文本安全规范决策主要由三个决策流程组成：
* 文字安全判断主流程
* 数字英文长度检测子流程
* 敏感词检测子流程

在对某一文本进行文本安全规范是否合规进行判断时，只需要调用文字安全判断主流程所在知识包，就能进行文本安全合规性判断。

备注：若要单独调用子流程，则直接调用子流程所在知识包即可。

文本安全判断知识包调用demo：com.fcy.client.Application.knowledge.decision.JudgeDecision

getDecision方法通过传入KnowledgeService和规则对象，例如文字安全判断主流程对象Text，返回Text的决策结果：

* 决策通过：返回1
* 决策不通过：返回0

```
	public static int getDecision(KnowledgeService knowledgeService, Text text) throws IOException {
		KnowledgePackage knowledgePackage = knowledgeService.getKnowledge("文本安全规范/textSafeJudgeBag");
    	KnowledgeSession session = KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);

    	session.insert(text);
    	session.fireRules();
    	
    	return text.getResultCode();
	}
```

#### 3.2 知识包调用示例

```
	String src = "一二三uuu零ABCdE，WWW123";
	Text text = new Text();
    text.setStatus(0);      //设置初始流程初始状态位于开始节点
    text.setSrcText(src);   //设置原始文本字符串
    text.setCurText(src);   //设置当前文本字符串，初始化时当前文本字符串一般与原始文本相同
    text.setResultCode(-1); //设置决策结果为-1
    	
	code = getDecision(UruleClient.KNOWLEDGE_SERVICE, text);  //调用知识包并返回决策结果
```

程序执行输出片段：

```
☢☢☢控制台输出：当前节点：敏感词未违规
☢☢☢控制台输出：当前节点：要检测动名词
☢☢☢控制台输出：当前节点：动名词未违规
☢☢☢控制台输出：当前节点：要检测重复度
☢☢☢控制台输出：当前节点：重复度未违规。流程结束，决策结果：OK
```


### 参考资料
* urule官方文档：[http://www.bstek.com/products/urule](http://www.bstek.com/products/urule)
* urule开源免费版：[https://github.com/youseries/urule](https://github.com/youseries/urule)

