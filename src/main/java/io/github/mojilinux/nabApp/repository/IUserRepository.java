package io.github.mojilinux.nabApp.repository;

import io.github.mojilinux.nabApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    @Query("SELECT u from User u where u.email =?1")
    public User findByEmail(String email);
}
