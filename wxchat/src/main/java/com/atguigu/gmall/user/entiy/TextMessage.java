package com.atguigu.gmall.user.entiy;

import java.util.Map;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import static com.atguigu.gmall.user.contant.WeChatContant.RESP_MESSAGE_TYPE_TEXT;

@XStreamAlias("xml")
public class TextMessage extends BaseMessage {

	@XStreamAlias("Content")
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public TextMessage(Map<String, String> requestMap, String content) {
		super(requestMap);
		// 设置文本消息的msgtype为text
		this.setMsgType("<![CDATA["+RESP_MESSAGE_TYPE_TEXT+"]]>");
		this.content = "<![CDATA["+content+"]]>";
	}


}
