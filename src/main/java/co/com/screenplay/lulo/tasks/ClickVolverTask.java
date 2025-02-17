package co.com.screenplay.lulo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.lulo.ui.ChatUI.BTN_VOLVER;
import static co.com.screenplay.lulo.utils.Constants.TIME_LONG;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ClickVolverTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_VOLVER,isClickable()).forNoMoreThan(TIME_LONG).seconds(),
                Click.on(BTN_VOLVER)
        );
    }

    public static ClickVolverTask finalizar(){
        return instrumented(ClickVolverTask.class);
    }

}
