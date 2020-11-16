package cn.xfnihao.interaction;

import lombok.Data;

import java.util.List;

import static cn.xfnihao.protocol.Command.CREATE_GROUP_RESPONSE;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/13
 */
@Data
public class CreateGroupResponsePacket  extends   Packet {

    private boolean success;

    private String groupId;

    private List<String> userNameList;

    @Override
    public Byte getCommand() {

        return CREATE_GROUP_RESPONSE;
    }
}
