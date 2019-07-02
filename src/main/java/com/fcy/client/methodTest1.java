package com.fcy.client;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.bstek.urule.action.ActionId;
import com.bstek.urule.model.ExposeAction;

@Component
public class methodTest1 {
	@ExposeAction("test1")
	public boolean test1() {
		return true;
	}
	@ExposeAction("test2")
	public String test2(String a) {
		System.out.println(a + " from test2");
		return a + " from test2";
	}
	@ExposeAction("test3")
	public void test3() {
		System.out.println("from test3");
	}
	@ExposeAction("test4")
	public void test4(String a) {
		System.out.println(a + " from test4");
	}
}
