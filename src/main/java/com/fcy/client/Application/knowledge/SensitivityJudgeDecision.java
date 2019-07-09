package com.fcy.client.Application.knowledge;

import java.io.IOException;

import org.springframework.boot.SpringApplication;

import com.bstek.urule.runtime.KnowledgePackage;
import com.bstek.urule.runtime.KnowledgeSession;
import com.bstek.urule.runtime.KnowledgeSessionFactory;
import com.bstek.urule.runtime.service.KnowledgeService;
import com.fcy.client.UruleClient;
import com.fcy.client.bean.Sensitivity;

public class SensitivityJudgeDecision {
	
	public static void getDecision(KnowledgeService knowledgeService) throws IOException {
		KnowledgePackage knowledgePackage = knowledgeService.getKnowledge("文本安全规范/sensitivityJudgeBag");
		KnowledgeSession session = KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);
		
		Sensitivity sensitivity = new Sensitivity();
		sensitivity.setStatus(1);
		sensitivity.setIsUseCharWhiteNameList(true);
		
		System.out.println(session.insert(sensitivity));
		session.fireRules();
	}
	
	public static void main(String[] args) throws IOException {
		//KnowledgeService knowledgeService = UruleClient.getKnowledgeService();
		KnowledgeService knowledgeService = UruleClient.KNOWLEDGE_SERVICE;
		getDecision(knowledgeService);
		SpringApplication.exit(UruleClient.CONTEXT);
	}
}
