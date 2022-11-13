package EhCache.controller;

import EhCache.calc.ICalc;
import EhCache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    Map<String, ICalc> calcMap;

    @GetMapping(path = "/{id}")
    public String getUser(@PathVariable String id) {
        return userService.getInfo(id);
    }

    /**
     * 调用的URL：
     * http://127.0.0.1:8001/user/calc/add 加法调用
     * http://127.0.0.1:8001/user/calc/sub 减法调用
     * http://127.0.0.1:8001/user/calc/mult 乘法调用
     * http://127.0.0.1:8001/user/calc/div 除法调用
     * @param opStr 运算符
     * @return
     */
    @GetMapping(path = "/calc/{opStr}")
    public String op(@PathVariable String opStr) {
        ICalc calc = calcMap.getOrDefault(opStr, null);
        if (null == calc) {
            return "没有找到正确的策略";
        }

        int i = 1;
        int j = 2;
        return calc.operation(i, j) + "";
    }
}
