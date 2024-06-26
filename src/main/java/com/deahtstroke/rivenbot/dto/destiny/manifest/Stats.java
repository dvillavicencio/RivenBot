package com.deahtstroke.rivenbot.dto.destiny.manifest;

import java.util.Map;
import lombok.Data;

@Data
public class Stats {

  private Long statGroupHash;

  private Map<String, StatDetails> stats;

  private Long primaryBaseStatHash;
}
