package com.fcy.client.Node.LogicNode;

import org.springframework.stereotype.Component;

import com.bstek.urule.action.ActionId;
import com.bstek.urule.model.ExposeAction;

import com.fcy.client.bean.Text;

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
	public static boolean judgeIsTotalLengthExceed(Text text) {
		return false;
	}
	
	@ExposeAction("判断数字英文长度是否超标")
	public static boolean judgeIsDigitLetterLengthExceed(Text text) {
		return false;
	}
	
	@ExposeAction("判断是否还有内容")
	public static boolean judgeIsOtherContentLeft(Text text) {
		return true;
	}
	
	@ExposeAction("判断敏感词是否违规")
	public static boolean judgeIsSensitiveIllegal(Text text) {
		return false;
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
