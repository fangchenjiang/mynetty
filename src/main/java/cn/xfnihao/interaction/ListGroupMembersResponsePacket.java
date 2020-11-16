package cn.xfnihao.interaction;

import cn.xfnihao.protocol.Session;
import lombok.Data;


import java.util.List;

import static cn.xfnihao.protocol.Command.LIST_GROUP_MEMBERS_RESPONSE;


@Data
public class ListGroupMembersResponsePacket extends Packet {

    private String groupId;

    private List<Session> sessionList;

    @Override
    public Byte getCommand() {

        return LIST_GROUP_MEMBERS_RESPONSE;
    }
}
