package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class BootstrapOperationResponse implements IMessage{
	private int messageNumber;
	private String sourceAddress;
	private String targetAddress;
	private LocalDateTime emisionTime;
	private String messageName;
	private String version;
	private boolean result;
	private String errorMessage;
	private String name;
	
	public BootstrapOperationResponse() {
		this.messageNumber = 6;
		this.emisionTime = LocalDateTime.now();
		this.name = "BootstrapOperationResponse";
		this.result = false;
	}
	public int getMessageNumber() {
		return messageNumber;
	}
	public void setMessageNumber(int messageNumber) {
		this.messageNumber = messageNumber;
	}
	public String getSourceAddress() {
		return sourceAddress;
	}
	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}
	public String getTargetAddress() {
		return targetAddress;
	}
	public void setTargetAddress(String targetAddress) {
		this.targetAddress = targetAddress;
	}
	public LocalDateTime getEmisionTime() {
		return emisionTime;
	}
	public void setEmisionTime(LocalDateTime emisionTime) {
		this.emisionTime = emisionTime;
	}
	public String getMessageName() {
		return messageName;
	}
	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getName() {
		return name;
	}

	public boolean getResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "name=" + name + ", messageNumber=" + messageNumber + ", emisionTime=" + emisionTime;
	}
	
	
}
