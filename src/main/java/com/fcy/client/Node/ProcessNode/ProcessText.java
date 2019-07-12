package com.fcy.client.Node.ProcessNode;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.bstek.urule.action.ActionId;
import com.bstek.urule.model.ExposeAction;

@Component
public class ProcessText {
	/*
	 * 统一数字：1 另、灵、零、o=>0  2 一~九=>1~9
	 * @param src 原文本
	 * @return 统一数字后的文本
	 */
	@ExposeAction("统一数字")
	public static String uniformDigit(String src) {
		//return "in func uniformDigit";
		Map<String, String> digitMap = new HashMap<String, String>();
		digitMap.put("另", "0");
		digitMap.put("灵", "0");
		digitMap.put("零", "0");
		digitMap.put("o", "0");
		digitMap.put("一", "1");
		digitMap.put("二", "2");
		digitMap.put("三", "3");
		digitMap.put("四", "4");
		digitMap.put("五", "5");
		digitMap.put("六", "6");
		digitMap.put("七", "7");
		digitMap.put("八", "8");
		digitMap.put("九", "9");
		
		for(Map.Entry<String, String> entry : digitMap.entrySet()) {
			src = src.replace(entry.getKey(), entry.getValue());
		}
		
		return src;
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
