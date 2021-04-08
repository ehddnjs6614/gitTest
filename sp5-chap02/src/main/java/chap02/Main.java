package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppContext.class);
		
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		Greeter g2 = ctx.getBean("greeter", Greeter.class);
		System.out.println("(g1==g2) = " + (g1 == g2));
		
		Greeter g3 = new Greeter();
		Greeter g4 = new Greeter();
		System.out.println("(g3==g4) = " + (g3 == g4));
		ctx.close();
	}

}
