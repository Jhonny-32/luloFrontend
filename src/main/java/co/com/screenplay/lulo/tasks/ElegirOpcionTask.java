package co.com.screenplay.lulo.tasks;


import co.com.screenplay.lulo.interaction.PasarVentana;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static co.com.screenplay.lulo.ui.ChatUI.*;
import static co.com.screenplay.lulo.utils.Time.waiting;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ElegirOpcionTask extends PageObject implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        waiting(5);
        WebDriver driver = getDriver();
        actor.attemptsTo(
                PasarVentana.pasarVentana()
        );
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.presenceOfElementLocated(PADRE));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(PADRE));
        wait.until(ExpectedConditions.elementToBeClickable(BTN_PROBLEMAS)).click();
        waiting(5);
    }

    public static ElegirOpcionTask eligeOpcion() {
        return instrumented(ElegirOpcionTask.class);
    }
}
