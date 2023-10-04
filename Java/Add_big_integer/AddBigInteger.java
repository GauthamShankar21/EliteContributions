import java.math.BigInteger;

public class AddBigInteger {
    private BigInteger number1;
    private BigInteger number2;
    private BigInteger result;

    AddBigInteger(String n1,String n2)
    {
        this.number1 = new BigInteger(n1);
        this.number2 = new BigInteger(n2);
    }

    public String sum()
    {
        result = number1.add(number2);
        System.out.println("Result of addition = " + result);
        return result.toString(5);
    }
}
