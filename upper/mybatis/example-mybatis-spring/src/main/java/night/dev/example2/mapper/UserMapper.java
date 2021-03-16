package night.dev.example2.mapper;

import night.dev.User.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("SELECT * FROM t_users WHERE id = #{userId}")
    User selectUser(@Param("userId") int userId);
}
