package com.fcy.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bstek.urule.Utils;
import com.bstek.urule.runtime.KnowledgePackage;
import com.bstek.urule.runtime.KnowledgeSession;
import com.bstek.urule.runtime.KnowledgeSessionFactory;
import com.bstek.urule.runtime.service.KnowledgeService;

import com.fcy.client.bean.Text;
import com.fcy.client.Node.ProcessNode.StandardText;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UruleClientApplicationTests {

    @Test
    public void contextLoads() throws IOException {
	st4();
    }

    public void st() throws IOException {

	// 创建一个KnowledgeSession对象
	KnowledgeService knowledgeService = (KnowledgeService) Utils.getApplicationContext().getBean(KnowledgeService.BEAN_ID);
	KnowledgePackage knowledgePackage = knowledgeService.getKnowledge("data1/bao1");
	KnowledgeSession session = KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);

	Integer integer = Integer.valueOf(11);

	Map<String, Object> pa = new HashMap();
	pa.put("age", integer);
	session.fireRules(pa);

	// Customer s = new Customer();
	// s.setAge(integer);
	// session.insert(s);
	// session.fireRules();
	String result = (String) session.getParameter("str");
	System.out.println("==========================>>>>>>" + result);

    }

    public void st4() throws IOException {

    	// 创建一个KnowledgeSession对象
    	KnowledgeService knowledgeService = (KnowledgeService) Utils.getApplicationContext()
    		.getBean(KnowledgeService.BEAN_ID);
    	KnowledgePackage knowledgePackage = knowledgeService.getKnowledge("文本安全规范/textSafeJudgeBag");
    	KnowledgeSession session = KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);

    	Text text = new Text();
    	text.setStatus(1);
    	text.setIsSendBySys(false);
    	
    	session.insert(text);
    	session.fireRules();
    	
    	//System.out.println(text.getIsSendByAdmin());
    	System.out.println(text.getResultCode());
    	System.out.println(text.getResultMessage());
    }

}
