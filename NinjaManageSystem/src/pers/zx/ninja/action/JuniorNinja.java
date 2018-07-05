package pers.zx.ninja.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import pers.zx.ninja.bean.NinjaMessage;
import pers.zx.ninja.db.Show;


/**
 * @author Administrator
 * ÖÐÈÌ¶¯×÷
 */
@SuppressWarnings("serial")
public class JuniorNinja extends ActionSupport{
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
