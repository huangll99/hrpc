package com.hll.hrpc.container;

import com.hll.hrpc.server.HrpcServer;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.InitializingBean;

/**
 * Author: huangll
 * Written on 17/2/16.
 */
@Getter
@Setter
public class HrpcRegistry implements InitializingBean {

  private String address;

  private String protocol;

  @Override
  public void afterPropertiesSet() throws Exception {
    HrpcServer.getInstance().start(address, protocol);
  }
}
