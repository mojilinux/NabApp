package io.github.mojilinux.nabApp.services.imp;

import io.github.mojilinux.nabApp.model.User;
import io.github.mojilinux.nabApp.services.ILoginService;
import io.github.mojilinux.nabApp.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService {

    @Autowired
    IUserService iUserService;


    @Override
    public User getUserByUsername(String username) {
        User user = iUserService.getUserByUsername(username);
        return user;
    }

    @Override
    public User save(User entity) {
        return iUserService.save(entity);
    }
}
