package per.liuqh.testdubbo;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import per.liuqh.serviceapi.service.DemoService;  

public class Consummer1 {  
   
    public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "dubbo-consumer.xml" });  
        context.start();  
        System.out.println("consumer1-消费都启动了");
        try{
        DemoService demoService = (DemoService) context.getBean("demoService"); //  
        String hello = demoService.sayHello("tom"); // ִ  
        System.out.println(hello);
        }catch(Exception e){
        	e.printStackTrace();
        }
        System.in.read();  
    }

}  