package rw.isoko.isoko_ry_ubumenyi.service;

import rw.isoko.isoko_ry_ubumenyi.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUser(UUID id);
    User updateUser(UUID id, User user);
    void removeUser (UUID id);
}
