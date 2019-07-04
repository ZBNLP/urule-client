package com.fcy.client.Node.ProcessNode;

import org.springframework.stereotype.Component;

import com.bstek.urule.action.ActionId;
import com.bstek.urule.model.ExposeAction;

@Component
public class ProcessText {
	
	@ExposeAction("统一数字")
	public static String uniformDigit(String src) {
		return "in func uniformDigit";
	}
	
	@ExposeAction("去除表情和热词")
	public static String deleteEmogiAndHotWord(String src) {
		return "in func deleteEmogiAndHotWord";
	}
	
	@ExposeAction("去除数字白名单")
	public static String deleteDigitWhiteNameList(String src) {
		return "in func deleteDigitWhiteNameList";
	}
	
	@ExposeAction("去除英文白名单")
	public static String deleteLetterWhiteNameList(String src) {
		return "in func deleteLetterWhiteNameList";
	}
	
	@ExposeAction("去除单词白名单")
	public static String deleteWordWhiteNameList(String src) {
		return "in func deleteWordWhiteNameList";
	}
	
	@ExposeAction("形近字转换")
	public static String transformSimilarChar(String src) {
		return "in func transformSimilarChar";
	}
	
	@ExposeAction("去除符号")
	public static String deleteSymbol(String src) {
		return "in func deleteSymbol";
	}
}
