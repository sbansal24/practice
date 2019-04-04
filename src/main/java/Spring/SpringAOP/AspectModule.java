package Spring.SpringAOP;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectModule {

//    @Pointcut("execution(* Spring.SpringAOP.Employee.getEmployeeName(..))")
//    private void getName(){
//
//    }

    @Pointcut("execution(* Spring.SpringAOP.*.*(..))")
    private void getName(){

    }

    @Pointcut("execution(* Spring.SpringAOP.Employee.*(..))")
    private void getNameBefore(){

    }

    @Before("getName() && getNameBefore()")
    public void beforeAdvice(){
        System.out.println("Before Advice has been run");
    }

    @Before("getNameBefore()")
    public void getNameBeforAdvice(){
        System.out.println("class level get advice");
    }

    @After(("getName()"))
    public void afterAdvice(JoinPoint joinPoint){
        System.out.println("After advice has been run");
        System.out.println("Join point is :"+joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(*  Spring.SpringAOP.Employee.*(..))", returning = "retVal")
    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning:" + retVal.toString() );
    }

    @Around(("getName()"))
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around advice has been run");
        System.out.println("Join point is :"+joinPoint.getSignature().getName());
        Object obj = joinPoint.proceed();
        return obj;
    }


}
