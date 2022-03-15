package EhCache.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Cacheable(value = "getUserInfo", key = "#id")
    public String getInfo(String id) {
        String message = "获取ID为" + id + "的用户";
        // 检测用户是否进入该方法
        System.out.println("调用方法getInfo：:" + message);
        return message;
    }
}
