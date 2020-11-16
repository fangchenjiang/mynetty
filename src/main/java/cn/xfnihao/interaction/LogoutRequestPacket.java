package cn.xfnihao.interaction;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import lombok.Data;

import static cn.xfnihao.protocol.Command.LOGOUT_REQUEST;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/13
 */
@Data
public class LogoutRequestPacket  extends  Packet {
    @Override
    public Byte getCommand() {

        return LOGOUT_REQUEST;
    }
}
