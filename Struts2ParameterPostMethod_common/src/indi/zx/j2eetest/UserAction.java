package indi.zx.j2eetest;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author XiaoHuZiXianShengZx
 * 直接参数传递
 *
 */
@SuppressWarnings("serial")
public class UserAction extends ActionSupport  {

	private String name;
	private int age;
	private String email;
	private String phone;
	//重载ActionSupport中的execute方法
	public String execute(){
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("email="+email);
		System.out.println("phone="+phone);
		
		return "success";
	}
	//添加get和set方法，用于参数传递
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
