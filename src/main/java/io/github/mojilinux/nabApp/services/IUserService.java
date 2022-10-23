package io.github.mojilinux.nabApp.services;

import io.github.mojilinux.nabApp.model.User;

public interface IUserService {
    User getUserByUsername(String username);
    User save(User entity);
}
