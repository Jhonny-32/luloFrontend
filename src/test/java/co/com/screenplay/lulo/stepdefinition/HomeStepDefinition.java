package co.com.screenplay.lulo.stepdefinition;

import co.com.screenplay.lulo.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.screenplay.lulo.utils.Constants.ACTOR;
import static net.serenitybdd.core.Serenity.getDriver;

public class HomeStepDefinition {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR).whoCan(BrowseTheWeb.with(getDriver()));
    }

    @When("hace click en tienes preguntas")
    public void locatesTheSectionInTheLowerRightHandSide() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickPreguntasTask.click());
    }

    @And("hace clic en tengo problemas con mi compra")
    public void ClickOnTheQuestionsSection() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ElegirOpcionTask.eligeOpcion()
        );
    }

    @And("ingresa la siguiente pregunta {string}")
    public void visualizesTheChatWindow(String pregunta) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                PrimeraPreguntaTask.primeraPregunta(pregunta)
        );
    }

    @And("ingresa otra pregunta {string}")
    public void selectTheOption(String pregunta) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SegundaPreguntaTask.segundaPregunta(pregunta)
        );
    }

    @Then("da click en volver")
    public void WatchAReplyInChat() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ClickVolverTask.finalizar()
        );
    }
}
