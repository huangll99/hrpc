package com.hll.hrpc.server;

import com.hll.hrpc.util.IpUtil;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * Author: huangll
 * Written on 17/2/17.
 */
public class HrpcServer {

  private String address;

  private String protocol;

  private EventLoopGroup bossEventLoopGroup = new NioEventLoopGroup(1);
  private EventLoopGroup workerEventLoopGroup = new NioEventLoopGroup(Runtime.getRuntime().availableProcessors());

  private HrpcServer() {
  }

  private static class HrpcServerHolder {
    static HrpcServer instance = new HrpcServer();
  }

  public static HrpcServer getInstance() {
    return HrpcServerHolder.instance;
  }

  /**
   * 启动tcp服务器
   */
  public void start(String address, String protocol) {
    this.address = address;
    this.protocol = protocol;

    ServerBootstrap bootstrap = new ServerBootstrap();
    bootstrap.group(bossEventLoopGroup, workerEventLoopGroup)
        .channel(NioServerSocketChannel.class)
        .childOption(ChannelOption.TCP_NODELAY, Boolean.TRUE)
        //:TODO handler
        .childHandler(null);
    try {
      ChannelFuture channelFuture = bootstrap.bind(IpUtil.parseHost(address), IpUtil.parsePort(address)).sync();
      channelFuture.channel().closeFuture().syncUninterruptibly();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * 关闭tcp服务器
   */
  public void stop() {
    bossEventLoopGroup.shutdownGracefully();
    workerEventLoopGroup.shutdownGracefully();
  }
}
