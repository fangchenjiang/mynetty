package cn.xfnihao.interaction;

import lombok.Data;

import java.util.List;

import static cn.xfnihao.protocol.Command.CREATE_GROUP_REQUEST;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/13
 */
@Data
public class CreateGroupRequestPacket  extends  Packet {
    private List<String> userIdList;

    @Override
    public Byte getCommand() {

        return CREATE_GROUP_REQUEST;
    }
}
