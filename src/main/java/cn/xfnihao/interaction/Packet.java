package cn.xfnihao.interaction;

import com.alibaba.fastjson.annotation.JSONField;
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
    @JSONField(deserialize = false, serialize = false)
    private Byte version = 1;


    @JSONField(serialize = false)
    public abstract Byte getCommand();
}
