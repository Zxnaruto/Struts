package pers.zx.ninja.action;



import pers.zx.ninja.bean.NinjaMessage;
import pers.zx.ninja.db.Choose;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Administrator
 * �ж���תҳ�棬��ͬ��ɫ������ͬ��jsp 
 */
@SuppressWarnings("serial")
public class AllAction extends ActionSupport {

	private NinjaMessage ninja;
	private int id;
	private int age;
	private String sex;
	private String level;
	private String name;
	public static String tempname=null;//�����޸ģ�λ���ж�
	public static String templevel=null;//�ȼ��жϣ�ѡ��չʾ����Ա�ȼ�
	public String execute(){
		
		Choose choose=new Choose();
		String result=null;
		
		if(choose.choose(ninja.getNinjaName(), ninja.getNinjaPassword()).equals("����")){
			id=choose.getTemp_id();
	        name=ninja.getNinjaName();
	        tempname=ninja.getNinjaName();
			age=choose.getTemp_age();
			sex=choose.getTemp_sex();
			level=choose.getTemp_level();
			templevel=choose.getTemp_level();
			result="Primary";
		}else if(choose.choose(ninja.getNinjaName(), ninja.getNinjaPassword()).equals("����")){
			id=choose.getTemp_id();
	        name=ninja.getNinjaName();
	        tempname=ninja.getNinjaName();
			age=choose.getTemp_age();
			sex=choose.getTemp_sex();
			level=choose.getTemp_level();
			templevel=choose.getTemp_level();
			result="Junior";
		}else if(choose.choose(ninja.getNinjaName(), ninja.getNinjaPassword()).equals("����")){
			id=choose.getTemp_id();
	        name=ninja.getNinjaName();
	        tempname=ninja.getNinjaName();
			age=choose.getTemp_age();
			sex=choose.getTemp_sex();
			level=choose.getTemp_level();
			templevel=choose.getTemp_level();
			result="Senior";
		}else if(choose.choose(ninja.getNinjaName(), ninja.getNinjaPassword()).equals("��Ӱ")){
			id=choose.getTemp_id();
	        name=ninja.getNinjaName();
	        tempname=ninja.getNinjaName();
			age=choose.getTemp_age();
			sex=choose.getTemp_sex();
			level=choose.getTemp_level();
			templevel=choose.getTemp_level();
			result="Top";
		}else{
			result="ERROR";
		}
	
		return result;
	}
	public NinjaMessage getNinja() {
		return ninja;
	}
	public void setNinja(NinjaMessage ninja) {
		this.ninja = ninja;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
