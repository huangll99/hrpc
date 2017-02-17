package com.hll.hrpc.server;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Author: huangll
 * Written on 17/2/17.
 */
public class HrpcServiceExecutor {

  private HrpcServiceExecutor() {
  }

  static class HrpcServiceExecutorHolder {
    static HrpcServiceExecutor instance = new HrpcServiceExecutor();
  }

  public static HrpcServiceExecutor getInstance() {
    return HrpcServiceExecutorHolder.instance;
  }

  private static Map<String, Object> servicesMap = new ConcurrentHashMap<>();

  /**
   * 注册服务
   */
  public void addService(String interfaceName, Object serviceBean) {
    servicesMap.put(interfaceName, serviceBean);
  }

  /**
   * 提交请求
   */
  public void submit() {

  }

}
