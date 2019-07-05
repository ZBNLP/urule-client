package com.fcy.client;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bstek.urule.Utils;
import com.bstek.urule.runtime.KnowledgePackage;
import com.bstek.urule.runtime.KnowledgeSession;
import com.bstek.urule.runtime.KnowledgeSessionFactory;
import com.bstek.urule.runtime.service.KnowledgeService;
import com.fcy.client.bean.Text;

@SpringBootApplication
public class ApplicationTest {
	
	
	
	public static void getDecision(ConfigurableApplicationContext context) throws IOException {
		// 创建一个KnowledgeSession对象
    	/*KnowledgeService knowledgeService = (KnowledgeService) Utils.getApplicationContext()
    			.getBean(KnowledgeService.BEAN_ID);*/
		
		KnowledgeService knowledgeService = (KnowledgeService) context
    			.getBean(KnowledgeService.BEAN_ID);
        		
    	KnowledgePackage knowledgePackage = knowledgeService.getKnowledge("文本安全规范/textSafeJudgeBag");
    	KnowledgeSession session = KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);

    	Text text = new Text();
    	text.setStatus(1);
    	text.setIsSendBySys(false);
    	
    	/*Text text1 = new Text();
    	text1.setStatus(1);
    	text1.setIsSendBySys(true);*/
    	
    	
    	System.out.println(session.insert(text));
    	session.fireRules();
    	//System.out.println(session.insert(text1));
    	//session.fireRules();
    	
    	
    	//System.out.println(text.getResultCode());
    	//System.out.println(text.getResultMessage());
    	
    	//System.out.println(text1.getResultCode());
    	//System.out.println(text1.getResultMessage());
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context = SpringApplication.run(ApplicationTest.class);
		getDecision(context);
		SpringApplication.exit(context);
	}
}
