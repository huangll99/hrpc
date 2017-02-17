package com.hll.hrpc.container;

import lombok.Getter;
import lombok.Setter;

/**
 * Author: huangll
 * Written on 17/2/16.
 */
@Getter
@Setter
public class HrpcReference {

  private String interfaceName;

  private String address;

  private String protocol;
}
