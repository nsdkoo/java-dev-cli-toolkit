package com..DevCliToolkit.service;

import java.io.File;
import java.util.Map;

public interface TomlService {

  /**
   * Ghi d峄?li峄噓 ra file TOML
   *
   * @param tomlFile file TOML c岷 ghi
   * @param tomlData d峄?li峄噓 Map
   */
  void writeToml(File tomlFile, Map<String, Object> tomlData);

  /**
   * Ph芒n t铆ch file TOML v脿 tr岷?v峄?d峄?li峄噓 d瓢峄沬 d岷g Map
   *
   * @param tomlFile file TOML c岷 ph芒n t铆ch
   * @return Map d峄?li峄噓
   */
  Map<String, Object> readToml(File tomlFile);
}

