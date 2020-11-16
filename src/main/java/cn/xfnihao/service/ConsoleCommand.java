package cn.xfnihao.service;

import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/13
 */
public interface ConsoleCommand {

    void exec(Scanner scanner, Channel channel);
}
