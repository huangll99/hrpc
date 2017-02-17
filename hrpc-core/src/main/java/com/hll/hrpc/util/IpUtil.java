package com.hll.hrpc.util;

/**
 * Author: huangll
 * Written on 17/2/17.
 */
public class IpUtil {

  public static String parseHost(String address){
    String[] split = address.split(":");
    return split[0];
  }

  public static int parsePort(String address){
    String[] split = address.split(":");
    return Integer.parseInt(split[1]);
  }
}
