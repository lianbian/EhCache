package EhCache.calc;

import org.springframework.stereotype.Service;

@Service("sub")
public class SubCalc implements ICalc{

    @Override
    public int operation(int i, int j) {
        return i-j;
    }
}
