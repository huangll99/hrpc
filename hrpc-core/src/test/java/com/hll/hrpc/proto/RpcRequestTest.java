package com.hll.hrpc.proto;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by huangll on 17/2/15.
 */
public class RpcRequestTest {

  @Test
  public void testRpcRequestToString() {
    RpcRequest rpcRequest = RpcRequest.builder()
        .messageId("001")
        .className("com.hll.demo.DemoService")
        .methodName("sayHello")
        .parameterTypes(new Class[]{String.class})
        .parameters(new Object[]{"hello"})
        .build();

    Assert.assertEquals(rpcRequest.toString(), "RpcRequest(messageId=001, className=com.hll.demo.DemoService, methodName=sayHello)");
  }

  @Test
  public void testRpcRequestBuilder() {
    RpcRequest rpcRequest = new RpcRequest();
    rpcRequest.setMessageId("001");
    rpcRequest.setClassName("com.hll.demo.DemoService");
    rpcRequest.setMethodName("sayHello");
    rpcRequest.setParameterTypes(new Class[]{String.class});
    rpcRequest.setParameters(new Object[]{"hello"});

    RpcRequest secondRpcRequest = RpcRequest.builder()
        .messageId("001")
        .className("com.hll.demo.DemoService")
        .methodName("sayHello")
        .parameterTypes(new Class[]{String.class})
        .parameters(new Object[]{"hello"})
        .build();

    Assert.assertEquals(rpcRequest, secondRpcRequest);
  }
}
