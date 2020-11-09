package cn.xfnihao.interaction;

import lombok.Data;

import static cn.xfnihao.protocol.Command.MESSAGE_REQUEST;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/9
 */
@Data
public class MessageRequestPacket   extends  Packet {

    String msg;
    @Override
    public Byte getCommand() {
        return  MESSAGE_REQUEST;
    }
}
