package co.com.screenplay.lulo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.screenplay.lulo.ui.ChatUI.SP_CHAT;
import static co.com.screenplay.lulo.ui.ChatUI.TXT_ESCRIBIR;
import static co.com.screenplay.lulo.utils.Constants.TIME_LONG;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SegundaPreguntaTask implements Task {

    private String pregunta;

    public SegundaPreguntaTask(String pregunta){
        this.pregunta = pregunta;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SP_CHAT,isNotVisible()).forNoMoreThan(TIME_LONG).seconds(),
                Enter.theValue(pregunta).into(TXT_ESCRIBIR),
                Hit.the(Keys.ENTER).into(TXT_ESCRIBIR),
                WaitUntil.the(SP_CHAT,isVisible()).forNoMoreThan(TIME_LONG).seconds(),
                WaitUntil.the(SP_CHAT,isNotVisible()).forNoMoreThan(TIME_LONG).seconds()
        );
        System.out.println();
    }

    public static SegundaPreguntaTask segundaPregunta(String pregunta){
        return instrumented(SegundaPreguntaTask.class, pregunta);
    }


}
