package rw.isoko.isoko_ry_ubumenyi.service;

import rw.isoko.isoko_ry_ubumenyi.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUser(Long UUID);
    User updateUser(Long UUID, User user);
    void removeUser (Long UUID);
}
