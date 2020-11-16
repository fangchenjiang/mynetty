package cn.xfnihao.interaction;

import lombok.Data;

import static cn.xfnihao.protocol.Command.LOGIN_REQUEST;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/7
 */
@Data
public class LoginRequestPacket extends  Packet {
    private String userName;

    private  String userId;

    private String password;

    @Override
    public Byte getCommand() {

        return LOGIN_REQUEST;
    }
}
