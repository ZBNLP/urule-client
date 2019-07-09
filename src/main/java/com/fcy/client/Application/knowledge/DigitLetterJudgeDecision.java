package com.fcy.client.Application.knowledge;

import java.io.IOException;

import org.springframework.boot.SpringApplication;

import com.bstek.urule.runtime.KnowledgePackage;
import com.bstek.urule.runtime.KnowledgeSession;
import com.bstek.urule.runtime.KnowledgeSessionFactory;
import com.bstek.urule.runtime.service.KnowledgeService;
import com.fcy.client.UruleClient;
import com.fcy.client.bean.DigitLetter;

public class DigitLetterJudgeDecision {
	
	public static void getDecision(KnowledgeService knowledgeService) throws IOException {
		KnowledgePackage knowledgePackage = knowledgeService.getKnowledge("文本安全规范/digitLetterJudgeBag");
		KnowledgeSession session = KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);
		
		DigitLetter digitLetter = new DigitLetter();
		digitLetter.setStatus(1);
		digitLetter.setIsCheckPhoneFormat(true);
		
		System.out.println(session.insert(digitLetter));
		session.fireRules();
	}
	public static void main(String[] args) throws IOException {
		//KnowledgeService knowledgeService = UruleClient.getKnowledgeService();
		KnowledgeService knowledgeService = UruleClient.KNOWLEDGE_SERVICE;
		getDecision(knowledgeService);
		SpringApplication.exit(UruleClient.CONTEXT);
	}
}
