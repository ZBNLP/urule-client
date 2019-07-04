package com.fcy.client.bean;

import com.bstek.urule.model.Label;

public class Text {
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
	
	@Label("是否系统发")
	private boolean isSendBySys; //1-系统发？
	@Label("是否超管发")
	private boolean isSendByAdmin; //2-超管发？
	@Label("是否说话频率超标")
	private boolean isTalkFrequencyExceed; //3-说话频率超标？
	@Label("是否总长度超标")
	private boolean isTotalLengthExceed; //4-总长度超标？
	@Label("是否要检测数字英文长度")
	private boolean isCheckDigitLetterLength; //5-要检测数字英文长度？//非计算节点
	@Label("是否数字英文长度超标")
	private boolean isDigitLetterLengthExceed; //6-数字英文长度超标？
	@Label("除了数字和英文，是否还有其他内容")
	private boolean isOtherContentLeft; //7-除了数字和英文，还有其他内容吗？
	@Label("是否敏感词违规")
	private boolean isSensitiveIllegal; //8-敏感词违规？
	@Label("是否要检测动名词")
	private boolean isCheckVerbNoun; //9-要检测动名词？//非计算节点
	@Label("是否动名词违规")
	private boolean isVerbNounIllegal; //10-动名词违规？
	@Label("是否要检测重复度")
	private boolean isCheckMultiplicity; //11-要检测重复度？//非计算节点
	@Label("是否重复度违规")
	private boolean isMultiplicityIllegal; //12-重复度违规？
	
	
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
	
	public boolean getIsSendBySys() {
		return this.isSendBySys;
	}
	public void setIsSendBySys(boolean isSendBySys) {
		this.isSendBySys = isSendBySys;
	}
	
	public boolean getIsSendByAdmin() {
		return this.isSendByAdmin;
	}
	public void setIsSendByAdmin(boolean isSendByAdmin) {
		this.isSendByAdmin = isSendByAdmin;
	}
	
	public boolean getIsTalkFrequencyExceed() {
		return this.isTalkFrequencyExceed;
	}
	public void setIsTalkFrequencyExceed(boolean isTalkFrequencyExceed) {
		this.isTalkFrequencyExceed = isTalkFrequencyExceed;
	}
	
	public boolean getIsTotalLengthExceed() {
		return this.isTotalLengthExceed;
	}
	public void setIsTotalLengthExceed(boolean isTotalLengthExceed) {
		this.isTotalLengthExceed = isTotalLengthExceed;
	}
	
	public boolean getIsCheckDigitLetterLength() {
		return this.isCheckDigitLetterLength;
	}
	public void setIsCheckDigitLetterLength(boolean isCheckDigitLetterLength) {
		this.isCheckDigitLetterLength = isCheckDigitLetterLength;
	}
	
	public boolean getIsDigitLetterLengthExceed() {
		return this.isDigitLetterLengthExceed;
	}
	public void setIsDigitLetterLengthExceed(boolean isDigitLetterLengthExceed) {
		this.isDigitLetterLengthExceed = isDigitLetterLengthExceed;
	}
	
	public boolean getIsOtherContentLeft() {
		return this.isOtherContentLeft;
	}
	public void setIsOtherContentLeft(boolean isOtherContentLeft) {
		this.isOtherContentLeft = isOtherContentLeft;
	}
	
	public boolean getIsSensitiveIllegal() {
		return this.isSensitiveIllegal;
	}
	public void setIsSensitiveIllegal(boolean isSensitiveIllegal) {
		this.isSensitiveIllegal = isSensitiveIllegal;
	}
	
	public boolean getIsCheckVerbNoun() {
		return this.isCheckVerbNoun;
	}
	public void setIsCheckVerbNoun(boolean isCheckVerbNoun) {
		this.isCheckVerbNoun = isCheckVerbNoun;
	}
	
	public boolean getIsVerbNounIllegal() {
		return this.isVerbNounIllegal;
	}
	public void setIsVerbNounIllegal(boolean isVerbNounIllegal) {
		this.isVerbNounIllegal = isVerbNounIllegal;
	}
	
	public boolean getIsCheckMultiplicity() {
		return this.isCheckMultiplicity;
	}
	public void setIsCheckMultiplicity(boolean isCheckMultiplicity) {
		this.isCheckMultiplicity = isCheckMultiplicity;
	}
	
	public boolean getIsMultiplicityIllegal() {
		return this.isMultiplicityIllegal;
	}
	public void setIsMultiplicityIllegal(boolean isMultiplicityIllegal) {
		this.isMultiplicityIllegal = isMultiplicityIllegal;
	}
}
