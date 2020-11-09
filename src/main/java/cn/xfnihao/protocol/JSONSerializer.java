package cn.xfnihao.protocol;

import com.alibaba.fastjson.JSON;

import static cn.xfnihao.protocol.SerializerAlgorithm.JSON;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/7
 */
public class JSONSerializer implements  Serializer {
    @Override
    public byte getSerializerAlgorithm() {
        return JSON;
    }

    @Override
    public byte[] serialize(Object object) {
        return com.alibaba.fastjson.JSON.toJSONBytes(object);
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        return com.alibaba.fastjson.JSON.parseObject(bytes, clazz);

    }
}
