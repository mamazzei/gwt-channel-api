package no.eirikb.gwtchannelapi.shared;

import no.eirikb.gwtchannelapi.client.GwtChannelApi;

public class MessageEvent extends Event {
	private String message;

	public MessageEvent() {
	}

	public MessageEvent(String message) {
		this.message = message;
	}

	@Override
	public void execute() {
	}

	public void execute(GwtChannelApi gwtChannelApi) {
		gwtChannelApi.append(message);
	}

}
