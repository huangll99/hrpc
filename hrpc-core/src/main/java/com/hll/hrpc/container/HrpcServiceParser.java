package com.hll.hrpc.container;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * Created by huangll on 17/2/16.
 */
public class HrpcServiceParser implements BeanDefinitionParser {

  @Override
  public BeanDefinition parse(Element element, ParserContext parserContext) {
    String interfaceName = element.getAttribute("interfaceName");
    String ref = element.getAttribute("ref");

    RootBeanDefinition beanDefinition = new RootBeanDefinition();
    beanDefinition.setBeanClass(HrpcService.class);
    beanDefinition.setLazyInit(false);
    beanDefinition.getPropertyValues().add("interfaceName", interfaceName);
    beanDefinition.getPropertyValues().add("ref", ref);

    parserContext.getRegistry().registerBeanDefinition(interfaceName, beanDefinition);

    return beanDefinition;
  }
}
