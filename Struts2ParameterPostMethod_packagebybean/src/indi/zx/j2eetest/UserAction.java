package indi.zx.j2eetest;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	private UserBean user;//创建UserBean对象
	//重写execute方法
	public String execute(){
		System.out.println("name="+user.getName());
		System.out.println("age="+user.getAge());
		System.out.println("email="+user.getEmail());
		System.out.println("phone="+user.getPhone());
		
		return "success";
	}
	//添加get和set方法
	public UserBean getUser() {
		return user;
	}
	public void setUser(UserBean user) {
		this.user = user;
	}
	
}
