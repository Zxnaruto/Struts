package indi.zx.j2eetest;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author XiaoHuZiXianShengZx
 * ֱ�Ӳ�������
 *
 */
@SuppressWarnings("serial")
public class UserAction extends ActionSupport  {

	private String name;
	private int age;
	private String email;
	private String phone;
	//����ActionSupport�е�execute����
	public String execute(){
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("email="+email);
		System.out.println("phone="+phone);
		
		return "success";
	}
	//���get��set���������ڲ�������
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
