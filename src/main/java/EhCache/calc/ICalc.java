package EhCache.calc;

import org.springframework.stereotype.Service;

@Service
public interface ICalc {
    /**
     * 计算器的运算方法
     * @param i
     * @param j
     * @return
     */
    int operation(int i, int j);
}
