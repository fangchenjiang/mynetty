package cn.xfnihao.protocol;

import io.netty.util.AttributeKey;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/9
 */
public interface Attributes {
//    AttributeKey<Boolean> LOGIN = AttributeKey.newInstance("login");
AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}
