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
		String src = "一二三uuu零ABCdE煩，WWW123";
		
		Text text = new Text();
    	text.setStatus(0);
    	text.setSrcText(src);
    	text.setCurText(src);
    	text.setResultCode(-1);
    	
		int code = -1;
		try {
			code = getDecision(UruleClient.KNOWLEDGE_SERVICE, text);
		}catch (Exception e) {
			System.out.println("get decision error");
			e.printStackTrace();
		}finally {
			System.out.println("EXIT APPLICATION...");
			SpringApplication.exit(UruleClient.CONTEXT);
		}
		
		System.out.println(code);
	}
}
