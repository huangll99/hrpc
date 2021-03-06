package com.hll.hrpc.container;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * Author: huangll
 * Written on 17/2/16.
 */
public class HrpcReferenceParser implements BeanDefinitionParser {
  @Override
  public BeanDefinition parse(Element element, ParserContext parserContext) {
    String interfaceName = element.getAttribute("interfaceName");
    String address = element.getAttribute("address");
    String protocol = element.getAttribute("protocol");

    RootBeanDefinition beanDefinition = new RootBeanDefinition();
    beanDefinition.setBeanClass(HrpcReference.class);
    beanDefinition.setLazyInit(false);
    beanDefinition.getPropertyValues().add("interfaceName", interfaceName);
    beanDefinition.getPropertyValues().add("address", address);
    beanDefinition.getPropertyValues().add("protocol", protocol);

    return beanDefinition;
  }
}
