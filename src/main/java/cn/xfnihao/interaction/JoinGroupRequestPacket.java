package cn.xfnihao.interaction;

import lombok.Data;

import static cn.xfnihao.protocol.Command.JOIN_GROUP_REQUEST;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/16
 */
@Data
public class JoinGroupRequestPacket extends  Packet {


    private String groupId;

    @Override
    public Byte getCommand() {

        return JOIN_GROUP_REQUEST;
    }
}
