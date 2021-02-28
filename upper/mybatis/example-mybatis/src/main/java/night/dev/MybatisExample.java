package night.dev;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class MybatisExample {
    private SqlSessionFactory sqlSessionFactory;

    private void init() {
        try {
            String resource = "mybatis.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            this.sqlSessionFactory =
                    new SqlSessionFactoryBuilder().build(inputStream);
        }
        catch (Exception ex){
            // handle any errors
            System.out.println("exception: " + ex.getMessage());
        }
    }

    public void runSql() {
        try {
            SqlSession session = this.sqlSessionFactory.openSession();
            User blog = session.selectOne(
                    "night.dev.UserMapper.selectUser", 1);
        } catch (Exception ex) {
            System.out.println("exception: " + ex.getMessage());
        }
    }

    public void run() {
        this.init();
        this.runSql();
    }
}
