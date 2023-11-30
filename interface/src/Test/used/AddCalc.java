package Test.used;

import Test.repository.CalculatorRepository;

public class AddCalc implements CalculatorRepository {
    @Override
    public Integer calc(Integer x, Integer y) {
        return x + y;
    }
}
