package indi.zx.Interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * @author XiaoHuZiXianShengZx
 * �Զ������������������ض��ķ���
 *
 */
@SuppressWarnings("serial")
public class LoggerInterceptor extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation chain) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("------ǰ�����ز���------");
		String result=chain.invoke();//ִ����һ���������磺��������action��ִ������������
		System.out.println("------�������ز���------");
		return result;
	}
	

}
