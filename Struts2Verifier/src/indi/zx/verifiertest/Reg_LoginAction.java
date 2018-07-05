package indi.zx.verifiertest;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionSupport;

import indi.zx.Bean.UserBean;

/**
 * @author XiaoHuZiXianShengZx
 * 
 * 校验动作类，完成注册时的各种校验工作，注册成功输出注册成功，转向reg_success.jsp
 * 否则跳回注册页面重新注册
 *
 */
@SuppressWarnings("serial")
public class Reg_LoginAction extends ActionSupport {

	private UserBean user;
	
	public String reg()throws Exception{
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
		if(this.hasFieldErrors()){
			return LOGIN;
		}
		System.out.println("注册成功");
		return SUCCESS;
	}

	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}
	
}
