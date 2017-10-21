package com.communicomm.messaging.messages.controller;

import java.util.ArrayList;

import com.communicom.messaging.generator.MessageGenerator;
import com.communicom.messaging.messages.IMessage;
import com.communicom.messaging.messages.PingServerRequest;
import com.communicom.messaging.messages.PingServerResponse;
import com.communicom.messaging.messages.SetWaitForSignalRequest;
import com.communicom.messaging.messages.SetWaitForSignalResponse;

public class MessageController {
	private ArrayList<IMessage>Messages = new ArrayList<>();
	
	public void sendMessage(int messageOption) {
		Messages.add(MessageGenerator.CreateMessageComponent(messageOption));
	}

	public void listMessage(int messageOption) {
		for (IMessage currentRequest: Messages){
			if(currentRequest.getMessageNumber()==messageOption) {
				System.out.println();
				System.out.println(currentRequest.toString());
				System.out.println();
			}
		}
	}

}
