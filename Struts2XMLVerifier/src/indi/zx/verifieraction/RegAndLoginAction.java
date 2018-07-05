package indi.zx.verifieraction;

import indi.zx.bean.UserBean;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class RegAndLoginAction extends ActionSupport {
	private UserBean user;
	public void validate(){
		System.out.println("校验的统一出口，对所有方法进行校验：这里可以放一些公共的验证");
	}
	
	public String reg()throws Exception{
		
		System.out.println("注册成功");
		return SUCCESS;
	}
	public String login()throws Exception{
		System.out.println("登陆成功");
		return SUCCESS;
	}

	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}
}
