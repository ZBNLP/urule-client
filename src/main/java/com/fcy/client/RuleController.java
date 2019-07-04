package com.fcy.client;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bstek.urule.Utils;
import com.bstek.urule.runtime.KnowledgePackage;
import com.bstek.urule.runtime.KnowledgeSession;
import com.bstek.urule.runtime.KnowledgeSessionFactory;
import com.bstek.urule.runtime.service.KnowledgeService;
import com.fcy.client.bean.Text;

/**
 * Desc
 *
 * @author zengxzh@yonyou.com
 * @version V1.0.0
 * @date 2018/1/4
 */
@RestController
public class RuleController {
    @RequestMapping("rule")
    public String rule(@RequestParam String data) throws IOException {
	// 创建一个KnowledgeSession对象
	KnowledgeService knowledgeService = (KnowledgeService) Utils.getApplicationContext()
		.getBean(KnowledgeService.BEAN_ID);
	KnowledgePackage knowledgePackage = knowledgeService.getKnowledge("文本安全规范/textSafeJudgeBag");
	KnowledgeSession session = KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);

	Integer integer = Integer.valueOf(data);

	// Map<String, Object> param = new HashMap();
	// param.put("age", integer);
	// session.fireRules(param);

	/*Customer s = new Customer();
	s.setAge(integer);
	session.insert(s);
	session.fireRules();
	String result = (String) session.getParameter("str");
	return String.valueOf(result);*/
	
	Text text = new Text();
	text.setStatus(1);
	text.setIsSendBySys(false);
	
	session.insert(text);
	session.fireRules();
	
	return data;
    }
    
    public static void main(String[] args) throws IOException {
    	RuleController ruleControl = new RuleController();
    	ruleControl.rule("555");
	}
}
