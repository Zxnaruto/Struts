package indi.zx.action;

import indi.zx.bean.UserBean;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport{
	
	private String nextAction;
	private UserBean user;//����UserBean����
	//��дexecute����
	public String execute(){
	
	if(user.getName().equals("zx")){
		nextAction="zx";
	}else if(user.getName().equals("admin")){
		nextAction="admin";
	}else{
		nextAction="ok";
	}	
		return SUCCESS;
	}
	//���get��set����
	public UserBean getUser() {
		return user;
	}
	public void setUser(UserBean user) {
		this.user = user;
	}
	public String getNextAction() {
		return nextAction;
	}
	public void setNextAction(String nextAction) {
		this.nextAction = nextAction;
	}
	
}
