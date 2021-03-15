package night.dev.example2.mapper;

import night.dev.User.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.mapper.MapperFactoryBean;

public interface UserMapper {
    @Select("SELECT * FROM users WHERE id = #{userId}")
    User selectUser(@Param("userId") String userId);
}
