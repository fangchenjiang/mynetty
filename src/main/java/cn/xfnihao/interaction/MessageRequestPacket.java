package cn.xfnihao.interaction;

import lombok.Data;

import static cn.xfnihao.protocol.Command.MESSAGE_REQUEST;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/9
 */
@Data
public class MessageRequestPacket   extends  Packet {

    private String toUserId;
    private String message;

    public MessageRequestPacket(String toUserId, String message) {
        this.toUserId = toUserId;
        this.message = message;
    }

    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }
}
