package com.awesome.justforinterview.utils;

import java.util.HashMap;
import java.util.Map;

public class ResponseHelper {
  public static Object success() {
    Map<String, Object> obj = new HashMap<String, Object>();
    obj.put("code", 200);
    obj.put("message", "success");
    obj.put("data", null);
    return obj;
  }

  public static Object success(String message, Object data) {
    Map<String, Object> obj = new HashMap<String, Object>();
    obj.put("code", 200);
    obj.put("message", message);
    obj.put("data", data);
    return obj;
  }

  public static Object fail() {
    Map<String, Object> obj = new HashMap<String, Object>();
    obj.put("code", 0);
    obj.put("message", "unknown error");
    obj.put("data", null);
    return obj;
  }

  public static Object fail(String errorCode, String errorMessage) {
    Map<String, Object> obj = new HashMap<String, Object>();
    obj.put("code", errorCode);
    obj.put("message", errorMessage);
    obj.put("data", null);
    return obj;
  }
}
