import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesRadioButtons{

    @Test

    public void CheckboxesRadioButtons() throws Exception{


        WebDriver  driver =new ChromeDriver();
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        driver.manage().window().maximize();

        WebElement option1 = driver.findElement(By.xpath("//input[@value='Cheese']"));
        option1.click();
        Thread.sleep(2000);

        WebElement option2 = driver.findElement(By.xpath("//input[@value='Milk']"));
        option2.click();
        Thread.sleep(2000);

        WebElement option3 = driver.findElement(By.xpath("//input[@value='Butter']"));
        option3.click();
        Thread.sleep(2000);


       String value = option1.getAttribute("value");
         System.out.println(value);

        Assert .assertTrue(option1.isSelected());

        Assert .assertTrue(option2.isSelected());




    }
}
