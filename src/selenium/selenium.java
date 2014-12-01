package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://www.tanafesta.com.br/");

        driver.findElement(By.xpath("//ul[@id='menu']/li[7]/a/cufon[2]/canvas")).click();
        driver.findElement(By.id("nome")).clear();
        driver.findElement(By.id("nome")).sendKeys("jacó");
        driver.findElement(By.id("nome")).clear();
        driver.findElement(By.id("nome")).sendKeys("jacós");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("Jacos.jejeviski");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("Jacos.jejeviski@yahoo.com.br");
        driver.findElement(By.id("fone")).clear();
        driver.findElement(By.id("fone")).sendKeys("99999999");
        driver.findElement(By.id("cidade")).clear();
        driver.findElement(By.id("cidade")).sendKeys("Tio do Campo");
        driver.findElement(By.id("uf")).clear();
        driver.findElement(By.id("uf")).sendKeys("sc");
        driver.findElement(By.id("mensagem")).clear();
        driver.findElement(By.id("mensagem")).sendKeys("Muuito bacana o Site só faltou minha foto.");
        driver.findElement(By.id("enviar")).click();
    }

}


