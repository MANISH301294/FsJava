package remote;

import org.testng.annotations.Test;

import java.util.Scanner;

public class FactorialTest {

    Factorial fact = new Factorial();

    @Test
    public void factTest()
    {
//        Scanner sc  = new Scanner(System.in);
//        int n = sc.nextInt();
      int factorial =   fact.factorialOfNumber(2);
        System.out.println(factorial);

    }
}
