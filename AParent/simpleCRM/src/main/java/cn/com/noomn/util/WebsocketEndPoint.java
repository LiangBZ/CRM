package cn.com.noomn.util;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;  
import org.springframework.web.socket.WebSocketSession;  
import org.springframework.web.socket.handler.TextWebSocketHandler;  

import cn.com.noomn.service.EmployeeVoService;
  
public class WebsocketEndPoint extends TextWebSocketHandler {  
	
	@Autowired
	private EmployeeVoService employeeVoService;
	private static Map<String, WebSocketSession> WebSocketSessionMap = new HashMap<String, WebSocketSession>();
  
    @Override  
    protected void handleTextMessage(WebSocketSession session,  TextMessage message) throws Exception {  
        super.handleTextMessage(session, message);  
        JSONObject fromObject = JSONObject.fromObject(message.getPayload());
        WebsocketVo websocketVo = (WebsocketVo) JSONObject.toBean(fromObject, WebsocketVo.class);
        websocketVo.setMessage("<a href='javascript:void(0)' onclick='loadMainBody(\""+ websocketVo.getURL() +"\")'>" + websocketVo.getMessage() + "</a>");
        
        String imgPath = (String)session.getHandshakeAttributes().get("imgPath");
        String imgFilePath = (String)session.getHandshakeAttributes().get("imgFilePath") + websocketVo.getSenderId() + ".png";
        File file = new File(imgFilePath);
		boolean exists = file.exists();
		if(exists)
			imgPath = imgPath + websocketVo.getSenderId() + ".png";
		else
			imgPath = imgPath + "no_image.png";
        
		websocketVo.setImgURL(imgPath);

        String string = JSONObject.fromObject(websocketVo).toString();
        
        this.sendMessageToEmployee(websocketVo.getApproverId(), new TextMessage(string));
    }
    
	@Override
	public void afterConnectionEstablished(WebSocketSession session)
			throws Exception {
		super.afterConnectionEstablished(session);
		String employeeId = (String)session.getHandshakeAttributes().get("employeeId");
		WebSocketSessionMap.put(employeeId, session);
		System.err.println("============" + employeeId + "已登录");
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		super.afterConnectionClosed(session, status);
		String employeeId = (String)session.getHandshakeAttributes().get("employeeId");
		WebSocketSessionMap.remove(employeeId);
		System.err.println("============" + employeeId + "已退出");
	}  
    
	public void sendMessageToEmployee(String reEmployeeId, TextMessage message) {
		WebSocketSession webSocketSession = WebSocketSessionMap.get(reEmployeeId);
		if(webSocketSession == null) return;
		if(webSocketSession.isOpen()) {
			try {
				webSocketSession.sendMessage(message);
				System.err.println("===========接收方：" + reEmployeeId);
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}
} 
