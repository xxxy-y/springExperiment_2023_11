package cn.edu.tyut.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Author 羊羊
 * @ClassName StudentAspect
 * @SubmitTime 周五
 * @DATE 2023/11/24
 * @Time 10:48
 * @Package_Name cn.edu.tyut.aspect
 */
@Aspect
public class StudentAspect {
    @Pointcut("execution(void cn.edu.tyut.service.impl.StudentServiceImpl.*())")
    public void pointCut() {
    }

    /**
     * 匹配around, 也就是满足void saveStudent(Student student)这个方法
     */
    @Pointcut("execution(void cn.edu.tyut.service.impl.StudentServiceImpl.saveStudent(..))")
    public void pointCut1() {
    }

    @Before("pointCut()")
    public void before() {
        System.out.println("Verification data");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("Log processing");
    }

    @Around("pointCut1()")
    public Object around(@NotNull ProceedingJoinPoint proceedingJoinPoint) {
        Object[] args = proceedingJoinPoint.getArgs();
        Object retVal;
        try {
            System.out.println("Verification data");
            retVal = proceedingJoinPoint.proceed(args);
            System.out.println("Log processing");
        } catch (Throwable e) {
            System.out.println("发生异常");
            throw new RuntimeException(e);
        }
        return retVal;
    }
}