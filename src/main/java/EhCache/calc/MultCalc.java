package EhCache.calc;

import org.springframework.stereotype.Service;

@Service("mult")
public class MultCalc implements ICalc{
    @Override
    public int operation(int i, int j) {
        return i*j;
    }
}
