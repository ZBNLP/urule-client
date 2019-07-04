package com.fcy.client.bean;

import com.bstek.urule.model.Label;

public class Sensitivity {
	@Label("是否要启用字符白名单")
	private boolean isUseCharWhiteNameList;     //1-要启用字符白名单？
	@Label("是否字符白名单违规")
	private boolean isCharWhiteNameListIllegal; //2-字符白名单违规？
	@Label("是否还有内容_1")
	private boolean isOtherContentLeft_1;       //3-还有内容？
	@Label("是否要转换形近字")
	private boolean isTransformSimilarChar;     //4-要转换形近字？
	@Label("是否还有内容_2")
	private boolean isOtherContentLeft_2;       //5-还有内容？
	@Label("是否还有敏感词")
	private boolean isOtherSensitiveWord;       //6-还有敏感词？
	@Label("是否敏感词违规")
	private boolean isSensitiveIllegal;         //7-敏感词违规（根据规则）？
	
	@Label("决策结果")
	private int resultCode;
	@Label("决策说明")
	private String resultMessage;
	
	@Label("当前状态")
	private int status;
	
	@Label("原始文本")
	private String srcText;
	@Label("当前文本")
	private String curText;
	
	
	public int getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
	
	public String getResultMessage() {
		return this.resultMessage;
	}
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	
	public int getStatus() {
		return this.status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public String getSrcText() {
		return this.srcText;
	}
	public void setSrcText(String srcText) {
		this.srcText = srcText;
	}
	
	public String getCurText() {
		return this.curText;
	}
	public void setCurText(String curText) {
		this.curText = curText;
	}
	
	public boolean getIsUseCharWhiteNameList() {
		return this.isUseCharWhiteNameList;
	}
	public void setIsUseCharWhiteNameList(boolean isUseCharWhiteNameList) {
		this.isUseCharWhiteNameList = isUseCharWhiteNameList;
	}
	
	public boolean getIsCharWhiteNameListIllegal() {
		return this.isCharWhiteNameListIllegal;
	}
	public void setIsCharWhiteNameListIllegal(boolean isCharWhiteNameListIllegal) {
		this.isCharWhiteNameListIllegal = isCharWhiteNameListIllegal;
	}
	
	public boolean getIsOtherContentLeft_1() {
		return this.isOtherContentLeft_1;
	}
	public void setIsOtherContentLeft_1(boolean isOtherContentLeft_1) {
		this.isOtherContentLeft_1 = isOtherContentLeft_1;
	}
	
	public boolean getIsTransformSimilarChar() {
		return this.isTransformSimilarChar;
	}
	public void setIsTransformSimilarChar(boolean isTransformSimilarChar) {
		this.isTransformSimilarChar = isTransformSimilarChar;
	}
	
	public boolean getIsOtherContentLeft_2() {
		return this.isOtherContentLeft_2;
	}
	public void setIsOtherContentLeft_2(boolean isOtherContentLeft_2) {
		this.isOtherContentLeft_2 = isOtherContentLeft_2;
	}
	
	public boolean getIsOtherSensitiveWord() {
		return this.isOtherSensitiveWord;
	}
	public void setIsOtherSensitiveWord(boolean isOtherSensitiveWord) {
		this.isOtherSensitiveWord = isOtherSensitiveWord;
	}
	
	public boolean getIsSensitiveIllegal() {
		return this.isSensitiveIllegal;
	}
	public void setIsSensitiveIllegal(boolean isSensitiveIllegal) {
		this.isSensitiveIllegal = isSensitiveIllegal;
	}
}
