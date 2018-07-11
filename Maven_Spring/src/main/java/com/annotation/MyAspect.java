package com.annotation;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect// ��ʾ����
public class MyAspect {
	
	@Before("execution(* *..ISomeService.doFirst(..))")
	public void before(){
		System.out.println("ִbefore");
	}
	
	@Before("execution(* *..ISomeService.doFirst(..))")
	public void before(JoinPoint jp){
		System.out.println("ִJoinPoint:"+jp);
	}
	
	@AfterReturning(value="execution(* *..ISomeService.doSecond(..))",returning = "result")
	public void after(Object result){
		System.out.println("AfterResult:"+result);
	}
	
	
	@Around("execution(* *..ISomeService.doThird(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("ִaroundBefore");
		Object obj = pjp.proceed();
		System.out.println("aroundAfter");
		return obj;
	}
}
