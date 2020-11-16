package cn.xfnihao.interaction;

import lombok.Data;

import static cn.xfnihao.protocol.Command.LOGIN_RESPONSE;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/9
 */
@Data
public class LoginResponsePacket  extends  Packet {
    private String userId;

    private String userName;

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }
}
