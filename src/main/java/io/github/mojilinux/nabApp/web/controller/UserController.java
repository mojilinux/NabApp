package io.github.mojilinux.nabApp.web.controller;

import io.github.mojilinux.nabApp.model.User;
import io.github.mojilinux.nabApp.repository.IUserRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/users")
public class UserController {

    private final IUserRepository userRepository;

    public UserController(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping()
    public String getUser(Model model) {
        model.addAttribute("user", userRepository.findAll());
        return "view-users";
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
