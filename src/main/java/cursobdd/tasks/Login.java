package cursobdd.tasks;

import cursobdd.models.DataUser;
import cursobdd.models.SearchData;
import cursobdd.userinterfaces.ChoucairwikiLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static cursobdd.userinterfaces.ChoucairwikiLogin.*;

public class Login implements Task {

    public Login(List<DataUser> dataUsers) {
        this.dataUsers = dataUsers;
    }
    List<DataUser> dataUsers;

    public static Login thePage(List<DataUser> dataUsers) {
        return Tasks.instrumented(Login.class, dataUsers);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LOGIN));
        actor.attemptsTo(
                Enter.theValue(dataUsers.get(0).getUser()).into(USER_FIELD),
                Enter.theValue(dataUsers.get(0).getPassword()).into(PASSWORD_FIELD)
        );
        actor.attemptsTo(Click.on(ENTER_BUTTON));
    }
}
