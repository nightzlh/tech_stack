package night.dev.structure;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        runJdbcExample();
        runLoadSrcExample();
    }

    private static void runJdbcExample() {
        JdbcExample example = new JdbcExample();
        example.run();
    }

    private static void runLoadSrcExample() {
        LoadSrcAsStreamExample example = new LoadSrcAsStreamExample();
        example.run();
    }
}
