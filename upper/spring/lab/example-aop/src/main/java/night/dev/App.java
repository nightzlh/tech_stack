package night.dev;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext();
        // ctx.load("classpath:spring/app-context-xml.xml");
        ctx.load("file:/home/nightdev/work/github/tech_stack/upper/spring/lab/example-aop/context.xml");
        ctx.refresh();
        NewDocumentarist documentarist =
                ctx.getBean("documentarist", NewDocumentarist.class);
        documentarist.execute();


        /* GenericApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);
        NewDocumentarist documentarist =
        //        ctx.getBean("documentarist", NewDocumentarist.class);
        documentarist.execute();
        */

    }
}
