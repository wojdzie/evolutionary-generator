package com.wojdzie.evolutionary.generator.service;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.wojdzie.evolutionary.generator.config.Config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class ConfigService {

    private static final Logger LOGGER = LogManager.getLogger(ConfigService.class);
    private final ObjectMapper mapper;

    public ConfigService() {
        this.mapper = new ObjectMapper();
    }

    public Config getConfigFromFile(String fileName) {
        File file = new File(fileName);
        Config config = null;
        try {
             config = mapper.readValue(file, Config.class);
        } catch (IOException e) {
            LOGGER.error("File {} could not be parsed: ", file.getName(), e);
        }

        return config;
    }
}
