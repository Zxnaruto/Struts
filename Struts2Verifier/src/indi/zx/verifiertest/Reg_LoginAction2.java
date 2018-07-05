package indi.zx.verifiertest;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionSupport;

import indi.zx.Bean.UserBean;

@SuppressWarnings("serial")
public class Reg_LoginAction2 extends ActionSupport {

	private UserBean user;
	public void validate(){
		System.out.println("校验的统一出口，对所有方法进行校验：这里可以放一些公共的验证");
	}
	
	public void validateReg(){
		if(user.getName()==null||user.getName().equals("")){
			this.addFieldError("user.name", "用户名不能为空");
		}else if(!Pattern.matches("^[a-zA-Z][a-zA-Z0-9_]{3,14}$", user.getName())){
			this.addFieldError("user.name", "用户名只能是以字母开头，后面可以跟字母、数字、下划线，长度只能是4~15位");
		}else if(user.getPassword()==null||user.getPassword().equals("")){
			this.addFieldError("user.password", "密码不能为空");
		}else if(!user.getPassword2().equals(user.getPassword())){
			this.addFieldError("user.password2", "两次密码输入不一致，请重新输入");
		}else if(user.getAge()<16){
			this.addFieldError("user.age", "未满16周岁不能注册");
		}
		
		
	}

	
	
	public void validateLogin(){
		if(user.getName()==null||user.getName().equals("")){
			this.addFieldError("user.name", "用户名不能为空");
		}else if(user.getPassword()==null||user.getPassword().equals("")){
			this.addFieldError("user.password", "密码不能为空");
		}
	}
	public String reg()throws Exception{
		//validateReg();
		//if(this.hasFieldErrors()){
		//	return LOGIN;
		System.out.println("注册成功");
		return SUCCESS;
	}
	public String login()throws Exception{
		//validateLogin();
		//if(this.hasFieldErrors()){
		//	return LOGIN;
		//}
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
