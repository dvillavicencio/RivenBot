package com.danielvm.destiny2bot.dto.destiny.manifest;

import lombok.Data;

import java.util.Map;

@Data
public class StatValues {

    Map<String, StatDetails> statDetailsMap;
}
