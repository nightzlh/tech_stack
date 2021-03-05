package night.dev;

import night.dev.example1.Example1;
import night.dev.example2.Example2;

public class App 
{
    public static void main( String[] args )
    {
        Example1 e1 = new Example1();
        e1.run();

        Example2 e2 = new Example2();
        e2.run();

        e2.printAutoConfiguration();
    }
}
