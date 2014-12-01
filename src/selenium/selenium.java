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

        // Acessar o Site
        driver.get("http://www.minha.unidavi.edu.br/");
        
        //Usuário
        driver.findElement(By.id("UWS_FRM_USR_NOME")).clear();
        driver.findElement(By.id("UWS_FRM_USR_NOME")).sendKeys("31301");
        
        //Senha
        driver.findElement(By.name("UWS_FRM_USR_SENHA")).clear();
        driver.findElement(By.name("UWS_FRM_USR_SENHA")).sendKeys("849328");
        
        //Continuar
        driver.findElement(By.name("acao")).click();
        
        //Sala virtual
        driver.findElement(By.linkText("Sala Virtual")).click();
        
        //Acessar pagina Trabalhos
        driver.findElement(By.linkText("Trabalhos")).click();
        driver.findElement(By.xpath("//div[@id='svMenuTrabalhos']/ul/li[5]/a/span[2]")).click();
        
        //Clica em cadastrar novo Arquivo
        driver.findElement(By.linkText("Cadastrar Novo Arquivo")).click();
        driver.findElement(By.id("titulo")).click();
        driver.findElement(By.id("titulo")).clear();
        driver.findElement(By.id("titulo")).sendKeys("teste");

        //Localiza Arquivo
        driver.findElement(By.id("arquivo")).sendKeys("C:\\Users\\LENOVO\\Downloads\\selenium-ide-2.8.0.xpi");
        driver.findElement(By.id("grupo")).click();
        //Nova Pasta
        new Select(driver.findElement(By.id("grupo"))).selectByVisibleText("Novo Pasta");
        driver.findElement(By.cssSelector("option[value=\"novo\"]")).click();
        driver.findElement(By.id("nomenovogrupo")).click();
        driver.findElement(By.id("nomenovogrupo")).clear();
        driver.findElement(By.id("nomenovogrupo")).sendKeys("teste2");
        //Clica em cadastrar
        driver.findElement(By.name("cadastrar")).click();
    
    }
}