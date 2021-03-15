package night.dev.example2;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;

import javax.sql.DataSource;

public class SqlSessionLocator {
    
    DataSource dataSource;
    
    public SqlSessionLocator (DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public SqlSessionFactory creatFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        return factoryBean.getObject();
    }
}

/*
* <bean id="sqlSessionFactory"
          factory-bean="sqlSessionLocator"
          factory-method="creatFactory"/>

 <bean id="userMapper" class="org.mybatis.spring.mapper.MapperFactoryBean">
        <property name="mapperInterface" value="night.dev.User.UserMapper" />
        <property name="sqlSessionFactory" ref="sqlSessionFactory" />
    </bean>
* * */