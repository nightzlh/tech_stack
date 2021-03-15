package night.dev.example1;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    
    public void run() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyBatisConfig.class);

        SqlSessionFactory factory = ctx.getBean(SqlSessionFactory.class);

        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(factory);
        
        //UserMapper user = sqlSessionTemplate.getMapper(UserMapper.class);
        
    }
}
