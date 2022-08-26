package io.github.mojilinux.nabApp.web.controller;

import io.github.mojilinux.nabApp.model.User;
import io.github.mojilinux.nabApp.repository.IUserRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/users", produces = "application/json")
public class UserController {

    private final IUserRepository userRepository;

    public UserController(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping()
    public Iterable<User> getUser(int pageNumber, int pageSize) {
        PageRequest page = PageRequest.of(pageNumber, pageSize, Sort.by("createdDate").descending());
        return userRepository.findAll(page).getContent();
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable Long id) throws EmptyResultDataAccessException {
        userRepository.deleteById(id);
    }
}
