package pers.zx.ninja.action;

import com.opensymphony.xwork2.ActionSupport;

import pers.zx.ninja.bean.NinjaMessage;
import pers.zx.ninja.db.RegInsert;

/**
 * @author Administrator
 *  ע�ᶯ��
 */
@SuppressWarnings("serial")
public class Register extends ActionSupport{
private NinjaMessage ninja;

public String execute(){
	RegInsert insert=new RegInsert();
	int temp=0;
	String str=ERROR;
	if(ninja.getNinjaLevel().equals("����")||ninja.getNinjaLevel().equals("����")||ninja.getNinjaLevel().equals("����")){
		temp=insert.Ins(ninja.getNinjaName(),ninja.getNinjaSex(),ninja.getNinjaAge(), ninja.getNinjaPassword());
		if(temp==1){
			str= SUCCESS;
		}else{
			str= ERROR;
		
	   }
		}
	return str;
}

public NinjaMessage getNinja() {
	return ninja;
}

public void setNinja(NinjaMessage ninja) {
	this.ninja = ninja;
}

}
