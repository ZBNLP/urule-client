package com.fcy.client;

import java.util.Date;

import com.bstek.urule.model.Label;

public class Customer {

    @Label("名称")
    private String name;
    @Label("年龄")
    private Integer age;
    @Label("出生日期")
    private Date birthday;
    @Label("等级")
    private int level;
    @Label("手机号")
    private String mobile;
    @Label("性别")
    private boolean gender;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Date getBirthday() {
	return birthday;
    }

    public Integer getAge() {
	return age;
    }

    public void setAge(Integer age) {
	this.age = age;
    }

    public void setBirthday(Date birthday) {
	this.birthday = birthday;
    }

    public int getLevel() {
	return level;
    }

    public void setLevel(int level) {
	this.level = level;
    }

    public String getMobile() {
	return mobile;
    }

    public void setMobile(String mobile) {
	this.mobile = mobile;
    }

    public boolean isGender() {
	return gender;
    }

    public void setGender(boolean gender) {
	this.gender = gender;
    }
}
