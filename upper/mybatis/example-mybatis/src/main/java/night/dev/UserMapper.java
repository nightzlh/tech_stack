package night.dev;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    // @Select("SELECT * FROM t_users WHERE id = #{id}")
    User selectUser(int id);
}
