package EhCache.calc;

import org.springframework.stereotype.Service;

@Service("add")
public class AddCalc implements ICalc{
    @Override
    public int operation(int i, int j) {
        return i+j;
    }
}
