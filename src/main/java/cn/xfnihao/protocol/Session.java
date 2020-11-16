package cn.xfnihao.protocol;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Fang chenjiang
 * @Date 2020/11/12
 */
@Data
@NoArgsConstructor
public class Session {
    // 用户唯一性标识
    private String userId;
    private String userName;

    public Session(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return userId + ":" + userName;
    }
}
