package org.examp.Service;
import org.examp.Entitys.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {
    List<User> getAllUsers();
    User getOne(int id);
}
