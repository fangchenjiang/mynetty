package cn.xfnihao.interaction;

import lombok.Data;

import static cn.xfnihao.protocol.Command.JOIN_GROUP_RESPONSE;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/16
 */
@Data
public class JoinGroupResponsePacket extends  Packet {
    private String groupId;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {

        return JOIN_GROUP_RESPONSE;
    }
}
