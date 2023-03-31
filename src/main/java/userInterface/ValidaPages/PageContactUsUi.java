package userInterface.ValidaPages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageContactUsUi {

    public static final Target TITTLE_GET_IN_TOUCH = Target.the("Titulo de la pafina Contact us ").locatedBy("//h2[@class='title text-center']");
    public static final Target INPUT_NAME_CONTACT_US = Target.the("Input campo name Contact us").located(By.name("name"));
    public static final Target INPUT_EMAIL_CONTACT_US = Target.the("Input campo email Contact us").located(By.name("email"));
    public static final Target INPUT_SUBJECT_CONTACT_US = Target.the("Input campo subjet Contact us").located(By.name("subject"));
    public static final Target INPUT_MESSAGE_CONTACT_US = Target.the("Input campo message Contact us").located(By.id("message"));
    public static final Target BTN_SELECT_FILE_CONTACT_US = Target.the("Boton seleccionar archivo Contact us").located(By.name("upload_file"));
    public static final Target BTN_SUBMIT_CONTACT_US = Target.the("Boton submit Contact us").located(By.name("submit"));



}
