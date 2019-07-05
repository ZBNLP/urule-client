package com.fcy.client.Application.knowledge;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bstek.urule.Utils;
import com.bstek.urule.runtime.KnowledgePackage;
import com.bstek.urule.runtime.KnowledgeSession;
import com.bstek.urule.runtime.KnowledgeSessionFactory;
import com.bstek.urule.runtime.service.KnowledgeService;
import com.fcy.client.UruleClient;
import com.fcy.client.bean.Text;

public class TextSafeJudgeDecision {
	public static void getDecision() throws IOException {
		// 创建一个KnowledgeSession对象
    	KnowledgeService knowledgeService = (KnowledgeService) Utils.getApplicationContext()
    			.getBean(KnowledgeService.BEAN_ID);
    	//KnowledgeService knowledgeService = (KnowledgeService) Utils.getApplicationContext();
        		
    	KnowledgePackage knowledgePackage = knowledgeService.getKnowledge("文本安全规范/textSafeJudgeBag");
    	KnowledgeSession session = KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);

    	Text text = new Text();
    	text.setStatus(1);
    	text.setIsSendBySys(false);
    	
    	session.insert(text);
    	session.fireRules();
    	
    	//System.out.println(text.getIsSendByAdmin());
    	System.out.println(text.getResultCode());
    	System.out.println(text.getResultMessage());
	}
	public static void getDecision(ConfigurableApplicationContext context) throws IOException {
		// 创建一个KnowledgeSession对象
		KnowledgeService knowledgeService = (KnowledgeService) context.getBean(KnowledgeService.BEAN_ID);
        		
    	KnowledgePackage knowledgePackage = knowledgeService.getKnowledge("文本安全规范/textSafeJudgeBag");
    	KnowledgeSession session = KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);

    	Text text = new Text();
    	text.setStatus(1);
    	text.setIsSendBySys(false);
    	
    	System.out.println(session.insert(text));
    	session.fireRules();
	}
	public static void getDecision(KnowledgeService knowledgeService) throws IOException {
		// 创建一个KnowledgeSession对象
    	KnowledgePackage knowledgePackage = knowledgeService.getKnowledge("文本安全规范/textSafeJudgeBag");
    	KnowledgeSession session = KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);

    	Text text = new Text();
    	text.setStatus(1);
    	text.setIsSendBySys(false);
    	
    	System.out.println(session.insert(text));
    	session.fireRules();
	}
	public static void main(String[] args) throws IOException {
		//getDecision();
		KnowledgeService knowledgeService = UruleClient.getKnowledgeService();
		getDecision(knowledgeService);
		getDecision(knowledgeService);
		//getDecision(UruleClient.CONTEXT);
		SpringApplication.exit(UruleClient.CONTEXT);
	}
}
