package indi.zx.verifieraction;

import indi.zx.bean.UserBean;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class RegAndLoginAction extends ActionSupport {
	private UserBean user;
	public void validate(){
		System.out.println("У���ͳһ���ڣ������з�������У�飺������Է�һЩ��������֤");
	}
	
	public String reg()throws Exception{
		
		System.out.println("ע��ɹ�");
		return SUCCESS;
	}
	public String login()throws Exception{
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
