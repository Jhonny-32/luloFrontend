package co.com.screenplay.lulo.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HacerClickEn implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("let iframePadre = document.querySelector(\"iframe[seamless]\");" +
                "let docPadre = iframePadre?.contentDocument || iframePadre?.contentWindow.document;" +
                "let iframeHijo = docPadre?.querySelector(\"iframe[style*='outline:none !important;']\");" +
                "let docHijo = iframeHijo?.contentDocument || iframeHijo?.contentWindow.document;" +
                "docHijo?.querySelector(\".tawk-button\")?.click();");
    }

    public static HacerClickEn botonPreguntas (){
        return Tasks.instrumented(HacerClickEn.class);
    }
}
