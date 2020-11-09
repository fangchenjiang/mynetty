package cn.xfnihao.interaction;

import lombok.Data;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/7
 */
@Data
public abstract class Packet {

    /**
     * 协议版本
     */
    private Byte version = 1;

    /**
     * 指令
     * @return
     */
    public abstract Byte getCommand();
}
