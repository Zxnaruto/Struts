package indi.zx.Interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * @author XiaoHuZiXianShengZx
 * 自定义拦截器用于拦截特定的方法
 *
 */
@SuppressWarnings("serial")
public class LoggerInterceptor extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation chain) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("------前置拦截操作------");
		String result=chain.invoke();//执行下一个操作，如：调用其他action或执行其他拦截器
		System.out.println("------后置拦截操作------");
		return result;
	}
	

}
