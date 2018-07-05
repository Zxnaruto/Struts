package indi.zx.verifiertest;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionSupport;

import indi.zx.Bean.UserBean;

@SuppressWarnings("serial")
public class Reg_LoginAction2 extends ActionSupport {

	private UserBean user;
	public void validate(){
		System.out.println("У���ͳһ���ڣ������з�������У�飺������Է�һЩ��������֤");
	}
	
	public void validateReg(){
		if(user.getName()==null||user.getName().equals("")){
			this.addFieldError("user.name", "�û�������Ϊ��");
		}else if(!Pattern.matches("^[a-zA-Z][a-zA-Z0-9_]{3,14}$", user.getName())){
			this.addFieldError("user.name", "�û���ֻ��������ĸ��ͷ��������Ը���ĸ�����֡��»��ߣ�����ֻ����4~15λ");
		}else if(user.getPassword()==null||user.getPassword().equals("")){
			this.addFieldError("user.password", "���벻��Ϊ��");
		}else if(!user.getPassword2().equals(user.getPassword())){
			this.addFieldError("user.password2", "�����������벻һ�£�����������");
		}else if(user.getAge()<16){
			this.addFieldError("user.age", "δ��16���겻��ע��");
		}
		
		
	}

	
	
	public void validateLogin(){
		if(user.getName()==null||user.getName().equals("")){
			this.addFieldError("user.name", "�û�������Ϊ��");
		}else if(user.getPassword()==null||user.getPassword().equals("")){
			this.addFieldError("user.password", "���벻��Ϊ��");
		}
	}
	public String reg()throws Exception{
		//validateReg();
		//if(this.hasFieldErrors()){
		//	return LOGIN;
		System.out.println("ע��ɹ�");
		return SUCCESS;
	}
	public String login()throws Exception{
		//validateLogin();
		//if(this.hasFieldErrors()){
		//	return LOGIN;
		//}
		System.out.println("��½�ɹ�");
		return SUCCESS;
	}

	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}
	
}
