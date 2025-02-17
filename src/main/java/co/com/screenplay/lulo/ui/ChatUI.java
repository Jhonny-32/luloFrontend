package co.com.screenplay.lulo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChatUI {
    public static final Target TXT_ESCRIBIR = Target.the("Escribe aquí y pulsa enter..")
            .located(By.xpath("/html/body/div/div/div/div[3]/div[2]/div[2]/div/div[3]/textarea"));
    public static By PADRE = By.xpath("//iframe[contains(@title,'chat widget')]");
    public static By BTN_PROBLEMAS = By.xpath("//button[contains(text(),'Tengo problemas con mi compra')]");
    public static By BTN_EMOJI = By.xpath("//*[@id='tawk-body']/span/div/div/div[2]");
    public static By SP_CHAT = By.xpath("//*[@id='tawk-body']/span/div/div/div[2]");
    public static By LBL_ESPERA = By.xpath("/html/body/div/div/div/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div/div/p");
    public static By BTN_VOLVER = By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/button/i");

}
