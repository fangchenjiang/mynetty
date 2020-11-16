package cn.xfnihao.command;

import cn.xfnihao.interaction.LogoutRequestPacket;
import cn.xfnihao.service.ConsoleCommand;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/13
 */
public class LogoutConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        LogoutRequestPacket logoutRequestPacket = new LogoutRequestPacket();
        channel.writeAndFlush(logoutRequestPacket);
    }
}
