package io.github.mojilinux.nabApp.services.imp;

import io.github.mojilinux.nabApp.model.User;
import io.github.mojilinux.nabApp.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username);
        if(user == null)
            throw new UsernameNotFoundException("کاربری با این مشخصات در سیستم موجود نیست!");
        return new CustomUserDetail(user);
    }
}
