package com.hll.hrpc.proto;

import lombok.*;

/**
 * Created by huangll on 17/2/15.
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class RpcResponse {

  public String messageId;

  public String error;

  public Object result;

}
