package indi.zx.verifiertest;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author XiaoHuZiXianShengZx
 * �������������
 *
 */
@SuppressWarnings("serial")
public class AgeAction extends ActionSupport{
    //hashmap����
	private Map<Integer,String>ageMap;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public AgeAction(){
		ageMap=new HashMap();
		for(int i=1;i<=120;i++){
			ageMap.put(new Integer(i), i+"");
		}
		
	}
	public Map<Integer, String> getAgeMap() {
		return ageMap;
	}
	public void setAgeMap(Map<Integer, String> ageMap) {
		this.ageMap = ageMap;
	}
	
}
