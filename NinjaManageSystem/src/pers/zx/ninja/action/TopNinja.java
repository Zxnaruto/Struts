package pers.zx.ninja.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import pers.zx.ninja.bean.NinjaMessage;
import pers.zx.ninja.db.Delete;
import pers.zx.ninja.db.Insert;
import pers.zx.ninja.db.Show;
import pers.zx.ninja.db.ShowAll;
import pers.zx.ninja.db.Update;


@SuppressWarnings("serial")
public class TopNinja extends ActionSupport{
	private NinjaMessage ninja;
	private List<NinjaMessage> list;
	private AllAction action=new AllAction();
	@SuppressWarnings({ "unchecked", "static-access" })
	//��ʾ���л�Ӱ
	public String execute(){
		
		Show show=new Show();
		list=show.SqlShow(action.templevel);
		if(list!=null){
		return SUCCESS;
		}else{
			return "error";
		}
	}
	//��ʾ����������Ϣ
	@SuppressWarnings("unchecked")
	public String Show(){
		ShowAll show=new ShowAll();
		list=show.SqlShow();
		if(list!=null){
			return SUCCESS;
			}else{
				return ERROR;
			}
	}
	//ɾ��

	public String del(){
	Delete del=new Delete();	
	String str=ERROR;
	int temp=0;
	if(ninja.getNinjaLevel().equals("����")||ninja.getNinjaLevel().equals("����")||ninja.getNinjaLevel().equals("����")){
	if("".equals(ninja.getNinjaId())||"".equals(ninja.getNinjaLevel())
			||ninja.getNinjaLevel().equals("��Ӱ")){
		str=ERROR;
	}else{
		temp=del.Del(ninja.getNinjaId(),ninja.getNinjaLevel());
		if(temp==1){
			str=SUCCESS;
		}else{
			str=ERROR;
		}
	}
	}
	return str;
	}
	//�޸����ߵȼ�

	public String upda(){
		Update upda=new Update();
		
		String str=ERROR;
		int temp=0;
		if(ninja.getNinjaLevel().equals("����")||ninja.getNinjaLevel().equals("����")||ninja.getNinjaLevel().equals("����")){
		if("".equals(ninja.getNinjaId())||"".equals(ninja.getNinjaLevel())
				||ninja.getNinjaLevel().equals("��Ӱ")){
			str=ERROR;
		}else{
			temp=upda.Upda(ninja.getNinjaId(),ninja.getNinjaLevel());
			if(temp==1){
				str=SUCCESS;
			}else{
				str=ERROR;
			}
		}}
		return str;
	}
	//���
	public String inse(){
		Insert inse=new Insert();
		String str=null;
		int temp=0;
		if("".equals(ninja.getNinjaName())||"".equals(ninja.getNinjaAge())||"".equals(ninja.getNinjaSex())
				||"".equals(ninja.getNinjaLevel())||"".equals(ninja.getNinjaPassword())||"".equals(ninja.getNinjaPassword_t())
				||(!ninja.getNinjaPassword().equals(ninja.getNinjaPassword_t()))){
			str=ERROR;
		}else{
			temp=inse.Ins(ninja.getNinjaName(), ninja.getNinjaAge(), ninja.getNinjaSex(), ninja.getNinjaLevel(), ninja.getNinjaPassword());
			if(temp==1){
				str=SUCCESS;
			}else{
				str=ERROR;
			}
		}
		return str;
	}
	public List<NinjaMessage> getList() {
		return list;
	}
	public void setList(List<NinjaMessage> list) {
		this.list = list;
	}
	public NinjaMessage getNinja() {
		return ninja;
	}
	public void setNinja(NinjaMessage ninja) {
		this.ninja = ninja;
	}

}
