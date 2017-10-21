package com.communicom.messaging.generator;

import com.communicom.messaging.messages.BootstrapOperationRequest;
import com.communicom.messaging.messages.BootstrapOperationResponse;
import com.communicom.messaging.messages.IMessage;
import com.communicom.messaging.messages.PingServerRequest;
import com.communicom.messaging.messages.PingServerResponse;
import com.communicom.messaging.messages.SetWaitForSignalRequest;
import com.communicom.messaging.messages.SetWaitForSignalResponse;

public class MessageGenerator {
	public static IMessage CreateMessageComponent(int messageOption){
		switch(messageOption){
			case 1:
				return new PingServerRequest();
			case 2:
				return new PingServerResponse();
			case 3:
				return new SetWaitForSignalRequest();
			case 4:
				return new SetWaitForSignalResponse();
			case 5:
				return new BootstrapOperationRequest();
			case 6:
				return new BootstrapOperationResponse();
		}
		return null;
	}
}
