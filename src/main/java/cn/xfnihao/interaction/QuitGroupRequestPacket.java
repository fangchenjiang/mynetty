package cn.xfnihao.interaction;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import lombok.Data;

import static cn.xfnihao.protocol.Command.QUIT_GROUP_REQUEST;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/16
 */
@Data
public class QuitGroupRequestPacket extends  Packet {
    private String groupId;

    @Override
    public Byte getCommand() {

        return QUIT_GROUP_REQUEST;
    }
}
