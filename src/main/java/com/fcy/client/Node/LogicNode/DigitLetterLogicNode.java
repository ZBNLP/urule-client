package com.fcy.client.Node.LogicNode;

import org.springframework.stereotype.Component;

import com.bstek.urule.action.ActionId;
import com.bstek.urule.model.ExposeAction;

import com.fcy.client.bean.DigitLetter;

@Component
public class DigitLetterLogicNode {
	@ExposeAction("判断是否有手机格式")
	public static boolean judgeIsPhoneFormatExist(DigitLetter digitLetter) {
		return false;
	}
	
	@ExposeAction("判断是否还有内容")
	public static boolean judgeIsOtherContentLeft(DigitLetter digitLetter) {
		return true;
	}
	
	@ExposeAction("判断是否中英数违规")
	public static boolean judgeIsChiLetterDigitIllegal(DigitLetter digitLetter) {
		return false;
	}
}
