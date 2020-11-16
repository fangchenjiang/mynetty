package cn.xfnihao.util;

import java.util.UUID;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/13
 */
public class IDUtil {
    public static String randomId() {
        return UUID.randomUUID().toString().split("-")[0];
    }
}
