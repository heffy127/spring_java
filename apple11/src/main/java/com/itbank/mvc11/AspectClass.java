package com.itbank.mvc11;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AspectClass {
	
	public void login() {
		System.out.println("===로그인==============");
	}

	public void login2() {
		System.out.println("===보안 로그인===========");
	}
	
	public void logout() {
		System.out.println("===로그아웃============");
	}
	
	public void returnCall(JoinPoint jp, Object returnObj) {
		System.out.println("===리턴값 존재==========");
		System.out.println((String)returnObj);
		Object[] args = jp.getArgs();
		System.out.println("물건명 " + args[0]);
		System.out.println("물건가격 " + args[1]);
	}
	
	public void errorCall() {
		System.out.println("에러 발생!!");
	}
	
	public void aroundCall(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("===aroundBefore======");
		pjp.proceed();
		System.out.println("===aroundAfter=======");
	}
}
