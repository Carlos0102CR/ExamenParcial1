package com.communicom.messaging.messages;

import java.time.LocalDateTime;

import com.communicom.messaging.messages.signals.SignalType;

public class SetWaitForSignalRequest implements IMessage{
	private int messageNumber;
	private String sourceAddress;
	private String targetAddress;
	private LocalDateTime emisionTime;
	private SignalType signal;
	private String signalValue;
	private String name;
	
	public SetWaitForSignalRequest(){
		this.messageNumber = 3;
		this.emisionTime = LocalDateTime.now();
		this.name = "SetWaitForSignalRequest";
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

	public SignalType getSignal() {
		return signal;
	}

	public void setSignal(SignalType signal) {
		this.signal = signal;
	}

	public String getSignalValue() {
		return signalValue;
	}

	public void setSignalValue(String signalValue) {
		this.signalValue = signalValue;
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
