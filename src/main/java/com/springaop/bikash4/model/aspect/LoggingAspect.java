package com.springaop.bikash4.model.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
@Aspect
public class LoggingAspect {




    @Pointcut("within(com.springaop.bikash4.model.bank.customerController.*)")
    public void allMethodsPointcut(){
    }

    @Before("allMethodsPointcut()")
    public void serviceBeforeMethodsExecution(JoinPoint joinpoint){
        String className = joinpoint.getTarget().getClass().getSimpleName();
        String methodName = joinpoint.getSignature().getName();
        System.out.println(className+" - "+methodName+" called at "+new Date());
    }
    @After("allMethodsPointcut()")
    public void serviceAfterMethodsExecution(JoinPoint joinpoint){
        System.out.println("------Method ended at: "+new Date());
    }

    //1.Example

    @Before("execution(public void displayBank())")
    public void getName(){
        System.out.println("Display Bank method called");
    }




}
