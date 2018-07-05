package indi.zx.UserAction;

import indi.zx.UserBean.UserBean;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport{

	
	private UserBean user;//创建UserBean对象
	public String execute(){
		System.out.println(user.getName()+" execute()方法调用");
		return SUCCESS;
	}
	public String add(){
		System.out.println(" add方法调用");
		
		return SUCCESS;
	}
    public String del(){
    	System.out.println(" del方法调用");
    	return SUCCESS;
    	}
    
	public UserBean getUser() {
		return user;
	}
	public void setUser(UserBean user) {
		this.user = user;
	}
	
}
