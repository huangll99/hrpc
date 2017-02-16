package com.hll.hrpc.proto;

import lombok.*;

import java.io.Serializable;

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
public class RpcRequest implements Serializable {

  private static final long serialVersionUID = -4323262752334497174L;

  private String messageId;

  private String className;

  private String methodName;

  private Class<?>[] parameterTypes;

  private Object[] parameters;

}
