package cn.xfnihao.util;

import cn.xfnihao.protocol.Attributes;
import io.netty.channel.Channel;
import io.netty.util.Attribute;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/9
 */
public class LoginUtil {

    public static void markAsLogin(Channel channel) {
        channel.attr(Attributes.LOGIN).set(true);
    }

    public static boolean hasLogin(Channel channel) {
        Attribute<Boolean> loginAttr = channel.attr(Attributes.LOGIN);

        return loginAttr.get() != null;
    }
}
