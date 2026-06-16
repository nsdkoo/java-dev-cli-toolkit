package com..DevCliToolkit.service;

import java.util.Map;

public interface ConfigService {

  /**
   * Load config from ~/.DevCliToolkit/config.yml
   *
   * @return Map of config values (authorName, authorEmail, license, ...)
   */
  Map<String, Object> loadConfig();

  void initConfig();

  /**
   * Save config to ~/.DevCliToolkit/config.yml
   */
  void saveConfig(Map<String, Object> config);

  /**
   * Get flatten value by key (e.g. "user.name") from config
   */
  String getValue(String key);

  /**
   * Get the absolute path to the config file (e.g. ~/.DevCliToolkit/config.yml)
   */
  String getConfigFilePath();

}

