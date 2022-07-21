import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumTest {


        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
            //ChromeDriver driver = new ChromeDriver();
            //webdriver.chrome.driver;
            ChromeDriver driver = CreateNewDriver();
            TestPage(driver);
            driver.quit();
        }


        public static ChromeDriver CreateNewDriver(){
            ChromeDriver driver = new ChromeDriver();
//          driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
            driver.get("https://demoqa.com/text-box");
            return driver;
        }

        public static void TestPage(ChromeDriver driver){
/*
            WebElement buton1 = driver.findElement(By.cssSelector(".centered summary"));
            buton1.click();
            WebElement buton2 = driver.findElement(By.cssSelector(".centered #jsondata"));
            buton2.clear();
            buton2.sendKeys("[\n" +
                    "   {\n" +
                    "      \"name\":\"Bob\",\n" +
                    "      \"age\":20\n" +
                    "   },\n" +
                    "   {\n" +
                    "      \"name\":\"George\",\n" +
                    "      \"age\":42\n" +
                    "   },\n" +
                    "   {\n" +
                    "      \"name\":\"Alex\",\n" +
                    "      \"age\":35\n" +
                    "   },\n" +
                    "   {\n" +
                    "      \"name\":\"Andrei\",\n" +
                    "      \"age\":55\n" +
                    "   }\n" +
                    "]");
            WebElement refresh = driver.findElement(By.cssSelector("#refreshtable"));
            WebElement caption = driver.findElement(By.id("caption"));
            caption.clear();
            caption.sendKeys("Albastru");
            refresh.click();



            WebElement rand1 = driver.findElement(By.cssSelector("#dynamictable tr"));
            System.out.println(rand1.getText());
            List<WebElement> tablerows = driver.findElements(By.cssSelector("#dynamictable tr"));
*/

            WebElement insertText = driver.findElement(By.cssSelector("#userName"));
            WebElement submit = driver.findElement(By.cssSelector("#submit"));
            WebElement email = driver.findElement(By.id("userEmail-label"));
            insertText.clear();
            insertText.sendKeys("Alexandru");
            submit.click();
            System.out.println(email.getText());


        }

    }

