package com.fcy.client.Node.LogicNode;

import org.springframework.stereotype.Component;

import com.bstek.urule.action.ActionId;
import com.bstek.urule.model.ExposeAction;
import com.fcy.client.bean.DigitLetter;
import com.fcy.client.bean.Sensitivity;
import com.fcy.client.bean.Text;
import com.fcy.client.UruleClient;
import com.fcy.client.Application.knowledge.decision.JudgeDecision;

@Component
public class TextLogicNode {
	@ExposeAction("判断是否由系统发")
	public static boolean judgeIsSendBySys(Text text) {
		return false;
	}
	
	@ExposeAction("判断是否由超管发")
	public static boolean judgeIsSendByAdmin(Text text) {
		return false;
	}
	
	@ExposeAction("判断说话频率是否超标")
	public static boolean judgeIsTalkFrequencyExceed(Text text) {
		return false;
	}
	
	@ExposeAction("判断总长度是否超标")
	public static boolean judgeIsTotalLengthExceed(Text text, int lenThreshold) {
		return text.getSrcText().length() > lenThreshold;
	}
	
	@ExposeAction("判断数字英文长度是否超标")
	public static boolean judgeIsDigitLetterLengthExceed(Text text) {
		System.out.println("**********开始子流程：判断数字英文长度是否超标**********");
		DigitLetter digitLetter = new DigitLetter();
		digitLetter.setStatus(0);
		digitLetter.setSrcText(text.getCurText());
		digitLetter.setCurText(text.getCurText());
		
		int decisionRlt = -1;
		try {
			decisionRlt = JudgeDecision.getDecision(UruleClient.KNOWLEDGE_SERVICE, digitLetter);
		}catch (Exception e) {
			System.out.println("判断数字英文长度是否超标节点计算异常，流程中断！！！");
			e.printStackTrace();
			decisionRlt = -1;
		}
		System.out.println("**********结束子流程：判断数字英文长度是否超标**********");
		if(1 == decisionRlt) {
			return false;
		}else if(0 == decisionRlt){
			return true;
		}else {
			text.setStatus(-1);
			return false;
		}
	}
	
	@ExposeAction("判断是否还有内容")
	public static boolean judgeIsOtherContentLeft(Text text) {
		return text.getCurText().length() != 0;
	}
	
	@ExposeAction("判断敏感词是否违规")
	public static boolean judgeIsSensitiveIllegal(Text text) {
		System.out.println("**********开始子流程：判断敏感词是否违规**********");
		Sensitivity sensitivity = new Sensitivity();
		sensitivity.setStatus(0);
		sensitivity.setSrcText(text.getCurText());
		sensitivity.setCurText(text.getCurText());
		
		int decisionRlt = -1;
		try {
			decisionRlt = JudgeDecision.getDecision(UruleClient.KNOWLEDGE_SERVICE, sensitivity);
		}catch (Exception e) {
			System.out.println("判断敏感词是否违规节点计算异常，流程中断！！！");
			e.printStackTrace();
			decisionRlt = -1;
		}
		System.out.println("**********结束子流程：判断敏感词是否违规**********");
		if(1 == decisionRlt) {
			return false;
		}else if(0 == decisionRlt){
			return true;
		}else {
			text.setStatus(-1);
			return false;
		}
	}
	
	@ExposeAction("判断动名词是否违规")
	public static boolean judgeIsVerbNounIllegal(Text text) {
		return false;
	}
	
	@ExposeAction("判断重复度是否违规")
	public static boolean judgeIsMultiplicityIllegal(Text text) {
		return false;
	}
}
