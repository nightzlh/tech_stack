package night.dev.example2;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import night.dev.example2.mapper.UserMapper;

public class Example2 {

    public void run() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
       
        // SqlSessionLocator locator = (SqlSessionLocator)context.getBean("sqlSessionLocator");
        // String locatorName = locator.getClass().getName();

        SqlSessionFactory factory = (SqlSessionFactory)context.getBean("sqlSessionFactory");
        
        //Object mapper = context.getBean("userMapper");
        //String name = mapper.getClass().getName();

        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(factory);
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        
        System.out.println("dsfdfd");
    }
}
