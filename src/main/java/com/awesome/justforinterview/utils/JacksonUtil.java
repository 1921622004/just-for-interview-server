package com.awesome.justforinterview.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JacksonUtil {
  static public String parseString(String jsonString, String field) {
    ObjectMapper objectMapper = new ObjectMapper();
    JsonNode node;
    try {
      node = objectMapper.readTree(jsonString);
      JsonNode leaf = node.get(field);
      if (leaf != null) {
        return leaf.asText();
      } else {
        return null;
      }
    } catch (IOException err) {
      return null;
    }
  }

  static public Integer parseInteger(String jsonString, String field) {
    ObjectMapper objectMapper = new ObjectMapper();
    JsonNode node;
    try {
      node = objectMapper.readTree(jsonString);
      JsonNode leaf = node.get(field);
      if (leaf != null) {
        return leaf.asInt();
      } else {
        return null;
      }
    } catch (IOException err) {
      return null;
    }
  }
}
