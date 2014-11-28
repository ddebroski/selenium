package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

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

        WebElement campoTexto = null;
        
        //insere Usuário
        campoTexto = driver.findElement(By.id("UWS_FRM_USR_NOME"));
        campoTexto.sendKeys("31301");

        //insere Senha
        campoTexto = driver.findElement(By.name("UWS_FRM_USR_SENHA"));
        campoTexto.sendKeys("******");

        //Clica em Continuar
        driver.findElement(By.name("acao")).click();
       
        //clica para ir para as materias
        driver.findElement(By.className("brand")).click();
        
        //clica para selecionar as materias
        driver.findElement(By.className("dropdown-toggle")).click();
        
        driver.findElement(By.linkText("?pagina=EAD_ambiente_virtual_sala&sala=11797&passo=recados")).click();
    }

}
