package pers.zx.ninja.action;

import java.util.List;

import pers.zx.ninja.bean.NinjaMessage;
import pers.zx.ninja.db.Show;
import pers.zx.ninja.db.UpdatePassword;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Administrator
 * ÏÂÈÌ¶¯×÷
 */
@SuppressWarnings("serial")
public class PrimaryNinja extends ActionSupport{

	private List<NinjaMessage> list;
	private String password;
	private String password_ok;
	private AllAction action=new AllAction();
	@SuppressWarnings({ "unchecked", "static-access" })
	public String execute(){
		
		Show show=new Show();
		list=show.SqlShow(action.templevel);
		if(list!=null){
		return SUCCESS;
		}else{
			return "error";
		}
	}
	@SuppressWarnings("static-access")
	public String UpdatePassword(){
		UpdatePassword newpassword=new UpdatePassword();
		String temp_str=null;
		if(("".equals(getPassword())||"".equals(getPassword_ok()))||(!getPassword().equals(getPassword_ok()))){
			temp_str="PasswordUpdateError";
			
	    }else{
	    	
	    	temp_str=newpassword.UpdaPassword(getPassword(),action.tempname);
	    }
		return temp_str;
	}
	public List<NinjaMessage> getList() {
		return list;
	}
	public void setList(List<NinjaMessage> list) {
		this.list = list;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword_ok() {
		return password_ok;
	}
	public void setPassword_ok(String password_ok) {
		this.password_ok = password_ok;
	}
	
	
	
}
