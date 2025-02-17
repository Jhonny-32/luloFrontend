package co.com.screenplay.lulo.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI extends PageObject {

    public static final Target IFRM_PADRE = Target.the("Frame padre").located(By.xpath("//iframe[@seamless]"));
    public static final Target IFRM_HIJO = Target.the("Frame Hijo").located(By.xpath("//iframe[contains(@style,'outline:none !important;')][1]"));
}
