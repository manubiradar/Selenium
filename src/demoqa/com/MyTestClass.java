package demoqa.com;

import org.testng.asserts.SoftAssert;

public class MyTestClass {
    public static void main(String[] args) {
        SoftAssert softAssert = new SoftAssert();

        int a = 10;
        int b = 5;
        String str = "Hello, World!";

        softAssert.assertTrue(a > b);
        softAssert.assertEquals(str, "Hello, World","Failed");
  
        softAssert.assertAll();
    }
}
