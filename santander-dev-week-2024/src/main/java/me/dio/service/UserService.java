package me.dio.service;

import me.dio.domain.model.User;

public interface UserService {

    User faindById(Long id);

    User create(User userToCreate);
}
