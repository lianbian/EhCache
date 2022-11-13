package EhCache.calc;

import org.springframework.stereotype.Service;

@Service("div")
public class DivCalc implements ICalc{
    @Override
    public int operation(int i, int j) {
        return i/j;
    }
}
