package userInterface.RegisterUser;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:webdriver.base.url")

public class HomePage extends PageObject {

    public final static Target BTN_SING_UP = Target.the("Boton para iniciar el registro").locatedBy("//a[@href='/login']");
    public final static Target BTN_CONTACT_US = Target.the("Boton para ingresar a la seccion de contactenos").locatedBy("//a[@href='/contact_us']");
}
