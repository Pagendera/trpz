package com.example.terminal.service.impl;

import com.example.terminal.model.TerminalSettings;
import com.example.terminal.repository.TerminalSettingsRepository;
import com.example.terminal.repository.UserRepository;
import com.example.terminal.service.TerminalSettingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TerminalSettingServiceImpl implements TerminalSettingService {
    private final TerminalSettingsRepository terminalSettingRepository;
    private final UserRepository userRepository;

    @Override
    public TerminalSettings findById(Long id) {
        // TODO
        return null;
    }

    @Override
    public TerminalSettings changeSettings(Long id, TerminalSettings terminalSettings) {
        // TODO
        return null;
    }

    @Override
    public void save(TerminalSettings settings) {
        // TODO
    }

    @Override
    public TerminalSettings findByUserId(Long id) {
        // TODO
        return null;
    }

    @Override
    public TerminalSettings changeSettingsByUserId(Long id, TerminalSettings terminalSettings) {
        // TODO
        return null;
    }
}