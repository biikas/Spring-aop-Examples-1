package com.springaop.bikash4.model.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogMethodParameterAspect {

    @Before("execution(* com.springaop.bikash4.model.bank.customerController.CustomerController.checkMoney())*")
    public void userControllerMethod1(JoinPoint joinPoint){
        System.out.println("Check money method is called");
    }
    @Before("execution(* com.springaop.bikash4.model.bank.customer.CustomerInterface.deposit(..))*")
    public void userControllerMethod2(JoinPoint joinPoint){
        System.out.println("Deposit Method is called");
        Object[] args =joinPoint.getArgs();
        for(Object obj:args){
            System.out.println(obj);
            System.out.println("---------");
        }
    }

}
