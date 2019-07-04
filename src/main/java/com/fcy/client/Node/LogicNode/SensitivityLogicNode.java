package com.fcy.client.Node.LogicNode;

import org.springframework.stereotype.Component;

import com.bstek.urule.action.ActionId;
import com.bstek.urule.model.ExposeAction;

import com.fcy.client.bean.Sensitivity;

@Component
public class SensitivityLogicNode {
	@ExposeAction("判断是否字符白名单违规")
	public static boolean judgeIsCharWhiteNameListIllegal(Sensitivity sensitivity) {
		return false;
	}
	
	@ExposeAction("判断是否还有内容")
	public static boolean judgeIsOtherContentLeft(Sensitivity sensitivity) {
		return true;
	}
	
	@ExposeAction("判断是否还有敏感词")
	public static boolean judgeIsOtherSensitiveWord(Sensitivity sensitivity) {
		return true;
	}
	
	@ExposeAction("判断是否敏感词违规")
	public static boolean judgeIsSensitiveIllegal(Sensitivity sensitivity) {
		return false;
	}
}
