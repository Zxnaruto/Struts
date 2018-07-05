package indi.zx.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport{

	private String username;
	@SuppressWarnings("rawtypes")
	Map session;//ÉùÃ÷map
	@SuppressWarnings("unchecked")
	public String execute() throws Exception{
		if(username.equals("zx")){
			session=ActionContext.getContext().getSession();
			session.put("loginSign", "loginSuccess");//map´«Öµ
			return "success";
		}else{
			return "login";
		}
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
