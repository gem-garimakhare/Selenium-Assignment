import org.testng.annotations.Test;

public class Countries {
    @Test(priority = 1,groups={"Group1"})
    public void Country1(){
        System.out.println("India");
    }

    @Test
    public void Country2(){
        System.out.println("Australia");
    }

    @Test(priority = 2,groups={"Group1"})
    public  void Country3(){
        System.out.println("Japan");
    }
}
