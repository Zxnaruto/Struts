package indi.zx.j2eetest;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	private UserBean user;//����UserBean����
	//��дexecute����
	public String execute(){
		System.out.println("name="+user.getName());
		System.out.println("age="+user.getAge());
		System.out.println("email="+user.getEmail());
		System.out.println("phone="+user.getPhone());
		
		return "success";
	}
	//���get��set����
	public UserBean getUser() {
		return user;
	}
	public void setUser(UserBean user) {
		this.user = user;
	}
	
}
