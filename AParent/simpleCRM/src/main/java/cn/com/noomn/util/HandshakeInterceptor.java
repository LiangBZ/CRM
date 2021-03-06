package cn.com.noomn.util;

import java.util.Map;  

import javax.servlet.http.HttpSession;

import org.springframework.http.server.ServerHttpRequest;  
import org.springframework.http.server.ServerHttpResponse;  
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;  
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;  
  
public class HandshakeInterceptor extends HttpSessionHandshakeInterceptor{  
  
    @Override  
    public boolean beforeHandshake(ServerHttpRequest request,  
            ServerHttpResponse response, WebSocketHandler wsHandler,  
            Map<String, Object> attributes) throws Exception {  
        System.out.println("Before Handshake");  
        if(request instanceof ServletServerHttpRequest) {
        	ServletServerHttpRequest servletRequest = (ServletServerHttpRequest)request;
        	HttpSession session = servletRequest.getServletRequest().getSession(false);
        	if(session != null) {
        		String employeeId = (String)session.getAttribute("employeeId");
        		if(employeeId == null) {
        			employeeId = "default-system";
        		}
        		attributes.put("WEBSOCKET_USERNAME", employeeId);
        	}
        }
        return super.beforeHandshake(request, response, wsHandler, attributes);  
    }  
  
    @Override  
    public void afterHandshake(ServerHttpRequest request,  
            ServerHttpResponse response, WebSocketHandler wsHandler,  
            Exception ex) {  
        System.out.println("After Handshake");  
        super.afterHandshake(request, response, wsHandler, ex);  
    }  
  
}  