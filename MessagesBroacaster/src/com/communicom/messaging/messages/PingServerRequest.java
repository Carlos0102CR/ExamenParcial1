package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class PingServerRequest implements IMessage{
	private int messageNumber;
	private String sourceAddress;
	private String targetAddress;
	private LocalDateTime emisionTime;
	private String name;
	
	public PingServerRequest(){
		this.messageNumber = 1;
		this.emisionTime = LocalDateTime.now();
		this.name = "PingServerRequest";
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

	public int getMessageNumber() {
		return messageNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMessageNumber(int messageNumber) {
		this.messageNumber = messageNumber;
	}

	public void setEmisionTime(LocalDateTime emisionTime) {
		this.emisionTime = emisionTime;
	}

	@Override
	public String toString() {
		return "name=" + name + ", messageNumber=" + messageNumber + ", emisionTime=" + emisionTime;
	}
	
	
	
}
