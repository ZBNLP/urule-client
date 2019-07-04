package com.fcy.client.bean;

import com.bstek.urule.model.Label;

public class DigitLetter {
	@Label("是否要检测手机格式")
	private boolean isCheckPhoneFormat;      //1-要检测手机格式？
	@Label("是否有手机格式")
	private boolean isPhoneFormatExist;      //2-有手机格式？
	@Label("是否还有内容_1")
	private boolean isOtherContentLeft_1;    //3-还有内容？
	@Label("是否还有内容_2")
	private boolean isOtherContentLeft_2;    //4-还有内容？
	@Label("是否还有内容_3")
	private boolean isOtherContentLeft_3;    //5-还有内容？
	@Label("是否要检测中英数")
	private boolean isCheckChiLetterDigit;   //6-要检测中英数？
	@Label("是否中英数违规")
	private boolean isChiLetterDigitIllegal; //7-中英数违规？
	
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
	
	public boolean getIsCheckPhoneFormat() {
		return this.isCheckPhoneFormat;
	}
	public void setIsCheckPhoneFormat(boolean isCheckPhoneFormat) {
		this.isCheckPhoneFormat = isCheckPhoneFormat;
	}
	
	public boolean getIsPhoneFormatExist() {
		return this.isPhoneFormatExist;
	}
	public void setIsPhoneFormatExist(boolean isPhoneFormatExist) {
		this.isPhoneFormatExist = isPhoneFormatExist;
	}
	
	public boolean getIsOtherContentLeft_1() {
		return isOtherContentLeft_1;
	}
	public void setIsOtherContentLeft_1(boolean isOtherContentLeft_1) {
		this.isOtherContentLeft_1 = isOtherContentLeft_1;
	}
	
	public boolean getIsOtherContentLeft_2() {
		return this.isOtherContentLeft_2;
	}
	public void setIsOtherContentLeft_2(boolean isOtherContentLeft_2) {
		this.isOtherContentLeft_2 = isOtherContentLeft_2;
	}
	
	public boolean getIsOtherContentLeft_3() {
		return this.isOtherContentLeft_3;
	}
	public void setIsOtherContentLeft_3(boolean isOtherContentLeft_3) {
		this.isOtherContentLeft_3 = isOtherContentLeft_3;
	}
	
	public boolean getIsCheckChiLetterDigit() {
		return this.isCheckChiLetterDigit;
	}
	public void setIsCheckChiLetterDigit(boolean isCheckChiLetterDigit) {
		this.isCheckChiLetterDigit = isCheckChiLetterDigit;
	}
	
	public boolean getIsChiLetterDigitIllegal() {
		return this.isChiLetterDigitIllegal;
	}
	public void setIsChiLetterDigitIllegal(boolean isChiLetterDigitIllegal) {
		this.isChiLetterDigitIllegal = isChiLetterDigitIllegal;
	}
}
