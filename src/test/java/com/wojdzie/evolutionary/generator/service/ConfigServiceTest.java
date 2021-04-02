package com.wojdzie.evolutionary.generator.service;

import com.wojdzie.evolutionary.generator.config.Config;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class ConfigServiceTest {

    private final ConfigService configService = new ConfigService();

    @Test
    void getConfigFromFileShouldReturnNullAfterParsingError() {
        Config config = configService.getConfigFromFile("not-existing-file-name.json");
        assertNull(config);
    }

    @Test
    void getConfigFromFileShouldReturnParsedConfig() {
        Config config = configService.getConfigFromFile("parameters.json");
        assertNotNull(config);
    }

}