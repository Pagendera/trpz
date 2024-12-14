package com.example.terminal.service.impl;

import com.example.terminal.model.TerminalSettings;
import com.example.terminal.model.User;
import com.example.terminal.repository.UserRepository;
import com.example.terminal.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public User saveUser(User user) {
        // TODO
        return null;
    }

    @Override
    public User findUserById(Long id) {
        // TODO
        return null;
    }

    @Override
    public TerminalSettings findSettingUserById(Long id) {
        // TODO
        return null;
    }

    @Override
    public User signIn(User user) {
        // TODO
        return null;
    }
}