package com.springbook.biz.common;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

/*
 * @Service public class LogAdvice {
 * 
 * @Pointcut("exectution(* com.springbook.biz.. *Impl.*(..))") // 포인트컷 public
 * void allPointcut() {}
 * 
 * @Before("allPointcut()") public void printLog() {
 * System.out.println("[공통 로그] 비지니스 로직 수행 전 동작"); //어드바이스 }
 * 
 * }
 */