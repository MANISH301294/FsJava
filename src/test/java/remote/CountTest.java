package remote;

import org.testng.annotations.Test;

import java.time.LocalDateTime;

public class CountTest {

    count c = new count();
@Test
    public void tc1()
{
   int startTime =  LocalDateTime.now().getNano();
    System.out.println("StartTime = "+ startTime);
    System.out.println(c.allCount(10));
    int endTime = LocalDateTime.now().getNano();
    System.out.println("EndTime ="+ endTime);
    int interval = endTime - startTime;
    System.out.println(interval);
}

@Test
public void tc2()
{
    int startTime =  LocalDateTime.now().getNano();
    System.out.println("StartTime = "+ startTime);
    System.out.println(c.allCount(1000));
    int endTime = LocalDateTime.now().getNano();
    System.out.println("EndTime ="+ endTime);
    int interval = endTime - startTime;
    System.out.println(interval);
}
}
