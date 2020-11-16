package cn.xfnihao.interaction;

import lombok.Data;

import static cn.xfnihao.protocol.Command.MESSAGE_RESPONSE;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/9
 */
@Data
public class MessageResponsePacket  extends  Packet {

    private String fromUserId;

    private String fromUserName;

    private String message;

    @Override
    public Byte getCommand() {

        return MESSAGE_RESPONSE;
    }
}
