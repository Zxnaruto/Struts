package indi.zx.UserAction;

import indi.zx.UserBean.UserBean;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport{

	
	private UserBean user;//����UserBean����
	public String execute(){
		System.out.println(user.getName()+" execute()��������");
		return SUCCESS;
	}
	public String add(){
		System.out.println(" add��������");
		
		return SUCCESS;
	}
    public String del(){
    	System.out.println(" del��������");
    	return SUCCESS;
    	}
    
	public UserBean getUser() {
		return user;
	}
	public void setUser(UserBean user) {
		this.user = user;
	}
	
}
