package com.hll.hrpc.proto;

import lombok.*;

/**
 * Created by huangll on 17/2/15.
 */
@Getter
@Setter
@ToString(exclude = {"parameterTypes", "parameters"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class RpcRequest {

  private String messageId;

  private String className;

  private String methodName;

  private Class<?>[] parameterTypes;

  private Object[] parameters;

}
