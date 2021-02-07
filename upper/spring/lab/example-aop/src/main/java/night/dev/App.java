package night.dev;

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
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();
        NewDocumentarist documentarist =
                ctx.getBean("documentarist", NewDocumentarist.class);
        documentarist.execute();
    }
}
