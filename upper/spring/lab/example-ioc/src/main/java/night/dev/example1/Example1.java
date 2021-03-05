package night.dev.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Example1 {

    public void run() {
        System.out.println("------------------- run example 1--------------------------------)");
        // ApplicationContext context = new ClassPathXmlApplicationContext("file:/Users/zlh/github/tech_stack/upper/spring/lab/example-ioc/Beans.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("Beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.setMessage("I'm object A");
        objA.getMessage();
        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        objB.getMessage();
    }
}
