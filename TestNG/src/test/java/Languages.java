import org.testng.annotations.Test;

public class Languages {
    @Test
    public void TestCase1(){
        System.out.println("Java");
    }
    @Test(groups={"Group1"})
    public void TestCase2(){
        System.out.println("Cpp");
    }
    @Test
    public void TestCase3(){
        System.out.println("Python");
    }
}
