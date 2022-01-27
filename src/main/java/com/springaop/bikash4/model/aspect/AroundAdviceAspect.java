package com.springaop.bikash4.model.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAdviceAspect {

    @Pointcut("execution( * com.springaop.bikash4.model.bank.customerController.CustomerController.*())")
    public void methodsPointcut(){
    }

    @Around("methodsPointcut()")
    public Object calculateExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
        long start= System.currentTimeMillis();
        System.out.println("Method will start now");

        Object output =pjp.proceed();

        System.out.println("Method Finished now");
        long elapseTime =System.currentTimeMillis()-start;
        System.out.println("Total time taken" +elapseTime+" milisecobds");
        return output;




    }
}
