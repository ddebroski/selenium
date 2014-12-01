package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author LENOVO
 */
public class selenium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Executa navegador no caso Firefox
        WebDriver driver = new FirefoxDriver();

driver.get("http://www.facebook.com/");

        //email do login
        WebElement campoDeTexto = driver.findElement(By.id("email"));
        campoDeTexto.sendKeys("digite seu email aqui");
        
        //Coloca a senha do login
        WebElement campoDeTexto2 = driver.findElement(By.id("pass"));
        campoDeTexto2.sendKeys("digite sua senha aqui");
         
        driver.findElement(By.id("u_0_l")).click();    
        
          Thread.sleep(10000);
        
         //escreve no Teste de Selenium          
        WebElement campoTexto4 = driver.findElement(By.id("u_0_w"));
        campoTexto4.sendKeys("Teste de Selenium Aula 01 12 2014");
        campoTexto4.submit();
           
    }
}
