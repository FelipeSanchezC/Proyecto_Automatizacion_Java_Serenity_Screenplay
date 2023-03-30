package userInterface.RegisterUser;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AccountInformationUi {

    public static final Target RADIO_BTN_TITTLE = Target.the("Seleccion del Radio buton genero").located(By.id("id_gender1"));
    public static final Target INPUT_PASSWORD = Target.the("Input ingreso del Pasword").located(By.id("password"));
    public static final Target DROP_DOWN_DAY = Target.the("Dropdown List day Birth Day").located(By.id("days"));
    public static final Target DROP_DOWN_MONTH = Target.the("Dropdown List month Birth Day").located(By.id("months"));
    public static final Target DROP_DOWN_YEAR = Target.the("Dropdown List year Birth Day").located(By.id("years"));
    public static final Target INPUT_FIRST_NAME = Target.the("Input firts name").located(By.id("first_name"));
    public static final Target INPUT_LAST_NAME = Target.the("Input last name").located(By.id("last_name"));
    public static final Target INPUT_ADDRESS = Target.the("Input last name").located(By.id("address1"));
    public static final Target SELECT_COUNTRY = Target.the("Select web list country").located(By.id("country"));
    public static final Target INPUT_STATE = Target.the("Input State").located(By.id("state"));
    public static final Target INPUT_CITY = Target.the("Input City").located(By.id("city"));
    public static final Target INPUT_ZIPCODE = Target.the("Input ZipCode").located(By.id("zipcode"));
    public static final Target INPUT_MOBILE_NUMBER = Target.the("Input Mobile Number").located(By.id("mobile_number"));
    public static final Target BTN_CREATE_ACCOUNT = Target.the("Boton de completar registro").locatedBy("//button[@data-qa='create-account']");





}
