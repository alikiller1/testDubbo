package per.liuqh.testdubbo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;  
  
 @Service(version="1.0.1",timeout=200000,actives=1)
public class DemoServiceImpl2 implements DemoService{  
      
     public String sayHello(String name) {  
    	 	try {
    	 		System.out.println("start======>"+new Date());
				Thread.sleep(5000);
				System.out.println("end======>"+new Date());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return "Hello-----------> " + name;  
     }  
     public List<User> getUsers() {  
         List<User> list = new ArrayList<User>();  
         User u1 = new User();  
         u1.setName("jack");  
         u1.setAge(20);  
         u1.setSex("男");  
           
         User u2 = new User();  
         u2.setName("tom");  
         u2.setAge(21);  
         u2.setSex("女");  
           
         User u3 = new User();  
         u3.setName("rose");  
         u3.setAge(19);  
         u3.setSex("女");  
           
         list.add(u1);  
         list.add(u2);  
         list.add(u3);  
         return list;  
     }  
}  
