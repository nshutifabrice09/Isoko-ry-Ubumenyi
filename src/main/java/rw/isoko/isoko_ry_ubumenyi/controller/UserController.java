package rw.isoko.isoko_ry_ubumenyi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.isoko.isoko_ry_ubumenyi.model.User;
import rw.isoko.isoko_ry_ubumenyi.service.UserService;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://lococalhost:3000")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> userList(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable ("id") UUID id){
        return userService.getUser(id);
    }

    @PutMapping("/update/user/{id}")
    public User updateUser(@PathVariable ("id") UUID id, @RequestBody User user){
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/delete/user/{id}")
    public void deleteUser(@PathVariable ("id") UUID id){
        userService.removeUser(id);
    }
}
