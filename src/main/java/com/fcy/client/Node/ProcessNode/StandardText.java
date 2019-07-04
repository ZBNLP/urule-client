package com.fcy.client.Node.ProcessNode;

import org.springframework.stereotype.Component;

import com.bstek.urule.action.ActionId;
import com.bstek.urule.model.ExposeAction;

@Component
public class StandardText {
	
	@ExposeAction("繁体转简体")
	public static String traditional2simplified(String src) {
		return "in func traditional2simplified";
	}
	
	@ExposeAction("大写转小写")
	public static String upper2lower(String src) {
		return "in func upper2lower";
	}
	
	@ExposeAction("全角转半角")
	public static String full2semiangle(String src) {
		return "in func full2semiangle";
	}
}
