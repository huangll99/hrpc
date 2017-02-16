package com.hll.hrpc.proto;

import lombok.*;

import java.io.Serializable;

/**
 * Created by huangll on 17/2/15.
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class RpcResponse implements Serializable{

  private static final long serialVersionUID = -1663840385137805336L;

  public String messageId;

  public String error;

  public Object result;

}
