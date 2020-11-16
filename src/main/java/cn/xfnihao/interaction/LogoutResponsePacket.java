package cn.xfnihao.interaction;

import lombok.Data;

import static cn.xfnihao.protocol.Command.LOGOUT_RESPONSE;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/13
 */
@Data
public class LogoutResponsePacket extends  Packet {

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {

        return LOGOUT_RESPONSE;
    }
}
