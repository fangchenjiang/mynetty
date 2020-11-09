package cn.xfnihao.server.handler;

import cn.xfnihao.interaction.MessageRequestPacket;
import cn.xfnihao.interaction.MessageResponsePacket;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/9
 */
public class MessageRequestHandler  extends SimpleChannelInboundHandler<MessageRequestPacket> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, MessageRequestPacket messageRequestPacket) throws Exception {

        MessageResponsePacket messageResponsePacket = new MessageResponsePacket();
        System.out.println("收到客户端消息:"+messageRequestPacket.getMsg());

        messageResponsePacket.setMsg("服务端回复【" + messageRequestPacket.getMsg() + "】");

        channelHandlerContext.channel().writeAndFlush(messageResponsePacket);

    }
}
