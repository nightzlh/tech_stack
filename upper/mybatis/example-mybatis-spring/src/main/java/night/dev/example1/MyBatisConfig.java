package night.dev.example1;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.mysql.jdbc.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import com.mysql.jdbc.*;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.mybatis.spring.mapper.MapperFactoryBean;

@Configuration
public class MyBatisConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        return factoryBean.getObject();
    }
    
    private DataSource dataSource () {
        int port = 3306;
        String user = "root";
        String passwd = "123456";
        String url = "jdbc:mysql://127.0.0.1:3306/lab_mybatis";
        MysqlDataSource ds = new MysqlDataSource();
        ds.setURL(url);
        ds.setPort(port);
        ds.setUser(user);
        ds.setPassword(passwd);
        ds.setDatabaseName("lab_mybatis");
        return new TransactionAwareDataSourceProxy(ds);
    }

    @Bean
    public DataSource dataSource2() {
        // String url = "jdbc:mysql://127.0.0.1:3306/lab_mybatis?user=root&password=nightDev@163";
        // String url = "jdbc:mysql://127.0.0.1:3306/lab_mybatis?user=root&password=123456";
        int port = 3306;
        String user = "root";
        String passwd = "123456";
        String url = "jdbc:mysql://127.0.0.1:3306/lab_mybatis";
        MysqlDataSource ds = new MysqlDataSource();
        ds.setURL(url);
        ds.setPort(port);
        ds.setUser(user);
        ds.setPassword(passwd);
        ds.setDatabaseName("lab_mybatis");
        return ds;
    } 

    /* @Bean
    public UserMapper userMapper() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        return sqlSessionTemplate.getMapper(UserMapper.class);
    } */
    
}