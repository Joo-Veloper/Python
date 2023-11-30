import Test.repository.CalculatorRepository;
import Test.used.SubCalc;

public class Call {
    public static void main(String[] args) {
//        CalculatorRepository calculatorRepository = new AddCalc();
        CalculatorRepository calculatorRepository = new SubCalc();
        Integer result = calculatorRepository.calc(10, 5);
        System.out.println("계산 결과는 (" + result + ")입니다.");
    }
}
