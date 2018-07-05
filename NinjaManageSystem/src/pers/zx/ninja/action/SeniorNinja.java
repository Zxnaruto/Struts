package pers.zx.ninja.action;

import java.util.List;

import pers.zx.ninja.bean.NinjaMessage;
import pers.zx.ninja.db.Show;


import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Administrator
 * ÉÏÈÌ¶¯×÷
 */
@SuppressWarnings("serial")
public class SeniorNinja extends ActionSupport{
	private List<NinjaMessage> list;
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
	
	public List<NinjaMessage> getList() {
		return list;
	}
	public void setList(List<NinjaMessage> list) {
		this.list = list;
	}
	
	
}
