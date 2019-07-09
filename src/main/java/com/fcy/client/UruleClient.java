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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
