package night.dev.example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {

    public void run() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig3.class);
        TestBean bean = ctx.getBean(TestBean.class);
        bean.print();
    }
}
