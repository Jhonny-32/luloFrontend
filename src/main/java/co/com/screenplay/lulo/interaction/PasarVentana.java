package co.com.screenplay.lulo.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class PasarVentana implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Set<String> ventanas = driver.getWindowHandles();
        String ventanaPrincipal = driver.getWindowHandle();
        for (String ventana : ventanas) {
            if (!ventana.equals(ventanaPrincipal)) {
                driver.switchTo().window(ventana);
                break;
            }
        }
    }

    public static PasarVentana pasarVentana() {
        return Tasks.instrumented(PasarVentana.class);
    }
}
