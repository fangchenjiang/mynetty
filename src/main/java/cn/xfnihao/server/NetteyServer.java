package cn.xfnihao.server;

import cn.xfnihao.protocol.PacketDecoder;
import cn.xfnihao.protocol.PacketEncoder;
import cn.xfnihao.server.handler.LoginRequestHandler;
import cn.xfnihao.server.handler.MessageRequestHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;


/**
 * @Author Fang chenjiang
 * @Date 2020/11/7
 */
public class NetteyServer {

    public static void main(String[] args) {
        ServerBootstrap serverBootstrap = new ServerBootstrap();

        NioEventLoopGroup boss = new NioEventLoopGroup();
        NioEventLoopGroup worker = new NioEventLoopGroup();
        serverBootstrap
                .group(boss, worker)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<NioSocketChannel>() {
                    protected void initChannel(NioSocketChannel ch) {

                        ch.pipeline().addLast(new PacketDecoder());
                        ch.pipeline().addLast(new LoginRequestHandler());
                        ch.pipeline().addLast(new MessageRequestHandler());
                        ch.pipeline().addLast(new PacketEncoder());
                    }
                }).handler(new ChannelInitializer<NioServerSocketChannel>() {
            @Override
            protected void initChannel(NioServerSocketChannel nioServerSocketChannel) throws Exception {
                System.out.println("服务器启动成功");
            }
        });

        bind(serverBootstrap,8000);
    }

    private static void bind(final ServerBootstrap serverBootstrap, final int port) {
        serverBootstrap.bind(port).addListener(future -> {
            if (future.isSuccess()){
                System.out.println("端口["+port+"]绑定成功");
            }else {
                System.out.println("端口["+port+"]绑定失败");
            }
        });
//        serverBootstrap.bind(port).addListener(new GenericFutureListener<Future<? super Void>>() {
//            public void operationComplete(Future<? super Void> future) {
//                if (future.isSuccess()) {
//                    System.out.println("端口[" + port + "]绑定成功!");
//                } else {
//                    System.err.println("端口[" + port + "]绑定失败!");
//                    bind(serverBootstrap, port + 1);
//                }
//            }
//        });
    }
}
