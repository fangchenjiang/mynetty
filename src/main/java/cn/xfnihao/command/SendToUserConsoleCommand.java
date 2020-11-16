package cn.xfnihao.command;

import cn.xfnihao.interaction.MessageRequestPacket;
import cn.xfnihao.service.ConsoleCommand;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/13
 */
public class SendToUserConsoleCommand implements ConsoleCommand {
    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.print("发送消息给某个某个用户：");

        String toUserId = scanner.next();
        String message = scanner.next();
        channel.writeAndFlush(new MessageRequestPacket(toUserId, message));
    }
}
