package controller.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.MemberConfig;
import model.annotation.Member;

public class MemberApp {
	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(MemberConfig.class);
		Member obj=ctx.getBean("memObj",Member.class);
		if(obj!=null) {
			System.out.println(obj.getCustomer());
		}
		Member obj1=ctx.getBean("memObj",Member.class);
		if(obj1!=null) {
			System.out.println(obj1.hashCode());
		}
	}
}
