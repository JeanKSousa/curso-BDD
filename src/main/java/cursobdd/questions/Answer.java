package cursobdd.questions;

import cursobdd.models.SearchData;
import cursobdd.userinterfaces.ChoucairwikiSearch;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static cursobdd.userinterfaces.ChoucairwikiSearch.*;

public class Answer implements Question <Boolean> {
    public Answer(List<SearchData> searchData) {
        this.searchData = searchData;
    }
    List<SearchData> searchData;

    public static Answer toThe(List<SearchData> searchData) {
        return  new Answer(searchData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String resultSearch = Text.of(RESULT).viewedBy(actor).asString();
        if (searchData.get(0).getResult().equals(resultSearch)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
