package cn.xfnihao.client.handler;

import cn.xfnihao.interaction.LogoutResponsePacket;
import cn.xfnihao.util.SessionUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/16
 */
public class LogoutResponseHandler  extends SimpleChannelInboundHandler<LogoutResponsePacket> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, LogoutResponsePacket logoutResponsePacket) {
        SessionUtil.unBindSession(ctx.channel());
    }
}
