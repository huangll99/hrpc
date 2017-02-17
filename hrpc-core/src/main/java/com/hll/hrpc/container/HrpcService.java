package com.hll.hrpc.container;

import com.hll.hrpc.server.HrpcServiceExecutor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Author: huangll
 * Written on 17/2/16.
 */
@Getter
@Setter
public class HrpcService implements ApplicationContextAware {

  private String interfaceName;

  private String ref;

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    Object bean = applicationContext.getBean(ref);
    HrpcServiceExecutor.getInstance().addService(interfaceName, bean);
  }
}
