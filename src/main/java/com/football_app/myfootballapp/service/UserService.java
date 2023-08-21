package com.football_app.myfootballapp.service;

import com.football_app.myfootballapp.domain.Player;
import com.football_app.myfootballapp.domain.User;
import com.football_app.myfootballapp.repository.PlayerRepository;
import com.football_app.myfootballapp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUser(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        userRepository.save(user);
        return user;
    }

    public void updateUser(User user) {
        userRepository.update(user);
    }

    public void deleteUserById(User user){
        userRepository.delete(user);
    }
}
