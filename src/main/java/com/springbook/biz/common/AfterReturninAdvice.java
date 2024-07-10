package com.springbook.biz.common;

public class AfterReturninAdvice {
	
	public void finallyLog() {
		System.out.println("[사후처리]비지니스 로직 수행 후 무조건 동작");
	}

}
