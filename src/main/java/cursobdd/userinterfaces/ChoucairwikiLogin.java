package cursobdd.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairwikiLogin {
    public static final Target LOGIN = Target.the("Enter to Login")
            .located(By.id("pt-login"));
    public static final Target USER_FIELD = Target.the("Type user")
            .located(By.id("wpName1"));
    public static final Target PASSWORD_FIELD = Target.the("Type password")
            .located(By.id("wpPassword1"));
    public static final Target ENTER_BUTTON = Target.the("Click to Login")
            .located(By.id("wpLoginAttempt"));
    //wpLoginAttempt
}
