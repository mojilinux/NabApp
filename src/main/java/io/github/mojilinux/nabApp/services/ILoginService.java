package io.github.mojilinux.nabApp.services;


import io.github.mojilinux.nabApp.model.User;

public interface ILoginService {
    User getUserByUsername(String username);
    User save(User entity);
}
