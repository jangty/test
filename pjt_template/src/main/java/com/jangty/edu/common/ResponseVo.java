package com.jangty.edu.common;

import java.util.List;
import java.util.Map;

public class ResponseVo {
		
	private String resultCode;
	private String messageDesc;
	private List resList;
	private Map resMap;

	public ResponseVo() {
		super();
	}
	
	public ResponseVo(String resultCode, String messageCode) {
		super();
		setResultInfo(resultCode, messageCode);
	}
	
	public ResponseVo(String resultCode, String messageCode, String messageDesc) {
		super();
		setResultInfo(resultCode, messageCode, messageDesc);
	}
	
	public ResponseVo(String resultCode, String messageDesc, List resList, Map resMap) {
		super();
		this.resList = resList;
		this.resMap = resMap;
		this.messageDesc = messageDesc;
		this.resultCode = resultCode;
	}
	
	public List getResList() {
		return resList;
	}

	public void setResList(List resList) {
		this.resList = resList;
	}

	public Map getResMap() {
		return resMap;
	}

	public void setResMap(Map resMap) {
		this.resMap = resMap;
	}

	public String getMessageDesc() {
		return messageDesc;
	}

	public void setMessageDesc(String messageDesc) {
		this.messageDesc = messageDesc;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public void setResultInfo(String resultCode, String messageCode){
		this.resultCode = resultCode;
//		this.messageDesc = MessageResolver.getMessage(messageCode);
		this.messageDesc = messageCode;
	}
	
	public void setResultInfo(String resultCode, String messageCode, String message){
		this.resultCode = resultCode;
		this.messageDesc = message;
	}
}
