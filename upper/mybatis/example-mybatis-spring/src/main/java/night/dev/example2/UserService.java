package night.dev.example2;

import night.dev.User.User;
import night.dev.example2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService implements  IUserService{
    @Autowired
    private UserMapper userMapper;

    /* public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    } */

    public User getUser(int userId) {
        return this.userMapper.selectUser(userId);
    } 
}
