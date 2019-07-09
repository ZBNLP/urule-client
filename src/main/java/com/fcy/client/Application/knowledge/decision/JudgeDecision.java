package com.fcy.client.Application.knowledge.decision;

import java.io.IOException;

import org.springframework.boot.SpringApplication;

import com.bstek.urule.runtime.KnowledgePackage;
import com.bstek.urule.runtime.KnowledgeSession;
import com.bstek.urule.runtime.KnowledgeSessionFactory;
import com.bstek.urule.runtime.service.KnowledgeService;
import com.fcy.client.UruleClient;
import com.fcy.client.bean.DigitLetter;
import com.fcy.client.bean.Sensitivity;
import com.fcy.client.bean.Text;

public class JudgeDecision {
	
	public static int getDecision(KnowledgeService knowledgeService, Text text) throws IOException {
		KnowledgePackage knowledgePackage = knowledgeService.getKnowledge("文本安全规范/textSafeJudgeBag");
    	KnowledgeSession session = KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);

    	session.insert(text);
    	session.fireRules();
    	
    	return text.getResultCode();
	}
	public static int getDecision(KnowledgeService knowledgeService, DigitLetter digitLetter) throws IOException {
		KnowledgePackage knowledgePackage = knowledgeService.getKnowledge("文本安全规范/digitLetterJudgeBag");
		KnowledgeSession session = KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);
		
		session.insert(digitLetter);
		session.fireRules();
		
		return digitLetter.getResultCode();
	}
	public static int getDecision(KnowledgeService knowledgeService, Sensitivity sensitivity) throws IOException {
		KnowledgePackage knowledgePackage = knowledgeService.getKnowledge("文本安全规范/sensitivityJudgeBag");
		KnowledgeSession session = KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);
		
		session.insert(sensitivity);
		session.fireRules();
		
		return sensitivity.getResultCode();
	}
	
	public static void main(String[] args) throws IOException {
		
		Text text = new Text();
    	text.setStatus(1);
    	text.setIsSendBySys(false);
    	
    	DigitLetter digitLetter = new DigitLetter();
		digitLetter.setStatus(1);
		digitLetter.setIsCheckPhoneFormat(true);
		
		Sensitivity sensitivity = new Sensitivity();
		sensitivity.setStatus(1);
		sensitivity.setIsUseCharWhiteNameList(true);
		
		int code;
		code = getDecision(UruleClient.KNOWLEDGE_SERVICE, text);
		System.out.println(code);
		/*code = getDecision(UruleClient.KNOWLEDGE_SERVICE, digitLetter);
		System.out.println(code);
		code = getDecision(UruleClient.KNOWLEDGE_SERVICE, sensitivity);
		System.out.println(code);*/
		
		SpringApplication.exit(UruleClient.CONTEXT);
	}
}
