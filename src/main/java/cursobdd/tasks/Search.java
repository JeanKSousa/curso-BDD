package cursobdd.tasks;

import cursobdd.models.SearchData;
import cursobdd.userinterfaces.ChoucairwikiSearch;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class Search implements Task {
    public Search(List<SearchData> searchData) {
        this.searchData = searchData;
    }
    List<SearchData> searchData;
    public static Search theConcep(List<SearchData> searchData) {
        return Tasks.instrumented(Search.class, searchData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(searchData.get(0).getConcept()).into(ChoucairwikiSearch.SEARCH_FIELD).thenHit(Keys.ENTER));
    }
}
