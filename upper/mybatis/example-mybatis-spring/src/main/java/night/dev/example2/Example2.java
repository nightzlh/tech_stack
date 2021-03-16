package night.dev.example2;

import night.dev.User.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import night.dev.example2.mapper.UserMapper;
import com.mysql.cj.jdbc.Driver;

public class Example2 {
    private ApplicationContext context;
    
    public Example2() {
        // this.context = new ClassPathXmlApplicationContext("Beans.xml");
        this.context = new AnnotationConfigApplicationContext(AppConfig.class);
    }
    
    public void run() {
        this.getMapperFromSqlSession();
        this.createMapperFromSqlSession();
        this.createUserService();
    }
    
    private void getMapperFromSqlSession() {
        String[] names = context.getBeanDefinitionNames();
        SqlSessionLocator locator = (SqlSessionLocator)context.getBean("sqlSessionLocator");
        String locatorName = locator.getClass().getName();
        Object mapper = context.getBean("userMapper");
        UserMapper beanMapper = (UserMapper)mapper;
        User user = beanMapper.selectUser(2);
        System.out.println("get name from mapper " + user.getName());
    }
    
    private void createMapperFromSqlSession() {
        SqlSessionFactory factory = (SqlSessionFactory)this.context.getBean("sqlSessionFactory");
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(factory);
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        User user = mapper.selectUser(1);
        System.out.println("get name from mapper " + user.getName());
    }

    private void createUserService() {
        UserService userService = (UserService)this.context.getBean("userService");
        User user = userService.getUser(1);
        System.out.println("get name from user service " + user.getName());
    }
}
