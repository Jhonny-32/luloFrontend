package co.com.screenplay.lulo.tasks;

import co.com.screenplay.lulo.interaction.HacerClickEn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.screenplay.lulo.utils.Constants.TIME_SHORT;
import static co.com.screenplay.lulo.utils.Time.waiting;

public class ClickPreguntasTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        waiting(TIME_SHORT);
        actor.attemptsTo(
                HacerClickEn.botonPreguntas()
        );
    }

    public static ClickPreguntasTask click() {
        return Tasks.instrumented(ClickPreguntasTask.class);
    }
}
