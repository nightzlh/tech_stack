package night.dev;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.InputStream;

public class MybatisExample {
    private SqlSessionFactory sessionFactory;

    private void init() {
        try {
            String resource = "mybatis.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            //this.sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }
        catch (Exception ex){
            // handle any errors
            System.out.println("exception: " + ex.getMessage());
        }
    }

    public void run() {
        this.init();
    }
}
