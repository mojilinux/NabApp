package io.github.mojilinux.nabApp.services.imp;

import io.github.mojilinux.nabApp.model.User;
import io.github.mojilinux.nabApp.repository.IUserRepository;
import io.github.mojilinux.nabApp.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    IUserRepository userRepository;

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User save(User entity) {
        return userRepository.save(entity);
    }
}
