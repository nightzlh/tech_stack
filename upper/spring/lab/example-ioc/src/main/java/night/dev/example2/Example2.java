package night.dev.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    public void run() {
        System.out.println("------------------- run example 2 --------------------------------)");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService myService = ctx.getBean(MyService.class);
        myService.doStuff();
    }

    public void printAutoConfiguration() {

        System.out.println("------------------- printAutoConfiguration --------------------------------)");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] names = ctx.getBeanDefinitionNames();
        for(int i = 0; i < names.length; ++i) {
            System.out.println(names[i]);
        }
    }
}
